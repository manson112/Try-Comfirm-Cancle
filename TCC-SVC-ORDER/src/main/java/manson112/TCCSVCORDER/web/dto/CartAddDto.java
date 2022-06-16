package manson112.TCCSVCORDER.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CartAddDto {
    private final Long customerId;
    private final String itemName;
}
