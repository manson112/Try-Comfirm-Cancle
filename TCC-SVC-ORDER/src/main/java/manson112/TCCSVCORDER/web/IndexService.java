package manson112.TCCSVCORDER.web;


import lombok.RequiredArgsConstructor;
import manson112.TCCSVCORDER.web.domain.cart.Cart;
import manson112.TCCSVCORDER.web.domain.cart.CartRepository;
import manson112.TCCSVCORDER.web.dto.CartAddDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class IndexService {
    private final CartRepository cartRepository;

    public Cart addToCart(CartAddDto cartAddDto) {
        Cart cart = new Cart(cartAddDto);
        return cartRepository.save(cart);
    }
}
