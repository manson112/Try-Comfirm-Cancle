package manson112.TCCSVCCUSTOMER.web.domain.customer;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import manson112.TCCSVCCUSTOMER.web.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Customer extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String customerName;

    @Column
    private String authKey;

    @Column
    private Long orderCount;

    @Builder
    public Customer(Long id, String customerName, String authKey, Long orderCount) {
        this.id = id;
        this.customerName = customerName;
        this.authKey = authKey;
        this.orderCount = orderCount;
    }

    public void updateAuthKey(String authKey) {
        this.authKey = authKey;
    }
}
