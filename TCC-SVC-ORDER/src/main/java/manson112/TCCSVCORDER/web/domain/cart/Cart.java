package manson112.TCCSVCORDER.web.domain.cart;

import lombok.Builder;
import lombok.Getter;
import manson112.TCCSVCORDER.web.domain.BaseTimeEntity;
import manson112.TCCSVCORDER.web.dto.CartAddDto;

import javax.persistence.*;

@Getter
@Entity
public class Cart extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long cartId;

    @Column
    Long userId;

    @Column
    String itemName;

    @Builder
    public Cart(Long cartId, Long userId, String itemName) {
        this.cartId = cartId;
        this.userId = userId;
        this.itemName = itemName;
    }

    public Cart(CartAddDto cartAddDto) {
        this.userId = cartAddDto.getUserId();
        this.itemName = cartAddDto.getItemName();
    }
}
