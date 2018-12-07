package sekury.springjwt;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jwt")
@RequiredArgsConstructor
public class JwtController {

    private final JwtService jwtService;

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ResponseBody
    public TokenDto getToken() {
        return TokenDto.builder().token(jwtService.getToken()).build();
    }

    @PostMapping(
            path = "validate",
            consumes = MediaType.TEXT_PLAIN_VALUE
    )
    public void validateToken(@RequestBody String token) {
        jwtService.validateToken(token);
    }
}
