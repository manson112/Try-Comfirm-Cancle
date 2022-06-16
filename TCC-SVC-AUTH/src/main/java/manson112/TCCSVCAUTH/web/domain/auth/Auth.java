package manson112.TCCSVCAUTH.web.domain.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import manson112.TCCSVCAUTH.web.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Auth extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authId;

    @Column
    private Long userId;

    @Column
    private String authKey;

    @Builder
    public Auth(Long authId, Long userId, String authKey) {
        this.authId = authId;
        this.userId = userId;
        this.authKey = authKey;
    }
}
