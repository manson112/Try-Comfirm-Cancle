package manson112.TCCSVCORDER.web;

import lombok.RequiredArgsConstructor;
import manson112.TCCSVCORDER.web.domain.cart.Cart;
import manson112.TCCSVCORDER.web.dto.CartAddDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {
    private final IndexService indexService;

    @PostMapping("/cart")
    public Cart addToCart(@RequestBody CartAddDto cartAddDto) {
        return indexService.addToCart(cartAddDto);
    }

}
