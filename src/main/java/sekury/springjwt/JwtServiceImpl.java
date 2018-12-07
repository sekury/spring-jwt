package sekury.springjwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {

    private static final String ISSUER = "sekury";

    private final RsaKeySupplier rsaKeySupplier;

    @Override
    public String getToken() {
        Algorithm algorithm = Algorithm.RSA256(
                rsaKeySupplier.getPublicKey(),
                rsaKeySupplier.getPrivateKey()
        );
        return JWT.create()
                .withIssuer(ISSUER)
                .sign(algorithm);
    }

    @Override
    public void validateToken(String token) {
        Algorithm algorithm = Algorithm.RSA256(
                rsaKeySupplier.getPublicKey(),
                rsaKeySupplier.getPrivateKey()
        );
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("sekury")
                .build();
        verifier.verify(token);
    }
}
