package manson112.TCCSVCCUSTOMER.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import manson112.TCCSVCCUSTOMER.web.domain.customer.Customer;
import manson112.TCCSVCCUSTOMER.web.domain.customer.CustomerRepository;
import manson112.TCCSVCCUSTOMER.web.dto.CustomerRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class IndexService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public Customer createCustomerAndAddCart(CustomerRequestDto customerRequestDto) {
        Customer customer = Customer.builder().customerName(customerRequestDto.getName()).build();
        customer = customerRepository.save(customer);

        String authKey = restTemplate.postForObject("http://localhost:8081/auth", customer.getId(), String.class);
        customer.updateAuthKey(authKey);
        log.debug("AUTHKEY ::::: {}", authKey);

        String itemName = getRandomItem();

        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("itemName", itemName);
        requestMap.put("customerId", customer.getId());

        restTemplate.postForObject("http://localhost:8082/cart", requestMap, Map.class);

        return customer;
    }

    private String getRandomItem() {
        Random random = new Random();
        String[] fruits = new String[] {"사과", "복숭아", "바나나", "포도", "무화과", "레몬"};
        return fruits[random.nextInt(fruits.length)];
    }

}
