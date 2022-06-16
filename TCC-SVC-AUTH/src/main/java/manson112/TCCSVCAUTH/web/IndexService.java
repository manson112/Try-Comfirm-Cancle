package manson112.TCCSVCAUTH.web;

import lombok.RequiredArgsConstructor;
import manson112.TCCSVCAUTH.web.domain.auth.Auth;
import manson112.TCCSVCAUTH.web.domain.auth.AuthRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class IndexService {
    private final AuthRepository authRepository;

    public String auth(Long userId) {
        String authKey = UUID.randomUUID().toString();

        Auth auth = Auth.builder().authKey(authKey).userId(userId).build();
        authRepository.save(auth);

        return auth.getAuthKey();
    }
}
