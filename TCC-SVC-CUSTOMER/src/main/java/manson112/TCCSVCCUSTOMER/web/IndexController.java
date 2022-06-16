package manson112.TCCSVCCUSTOMER.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import manson112.TCCSVCCUSTOMER.web.domain.customer.Customer;
import manson112.TCCSVCCUSTOMER.web.dto.CustomerRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class IndexController {
    private final IndexService indexService;

    @PostMapping("/customer")
    public Customer createCustomerAndAddCart(@RequestBody CustomerRequestDto customerRequestDto) {
        return indexService.createCustomerAndAddCart(customerRequestDto);
    }

}
