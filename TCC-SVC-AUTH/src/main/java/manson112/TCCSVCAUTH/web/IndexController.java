package manson112.TCCSVCAUTH.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {
    private final IndexService indexService;

    @PostMapping("/auth")
    public String auth(@RequestBody Long userId) {
        return indexService.auth(userId);
    }

}
