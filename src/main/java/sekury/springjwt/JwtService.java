package sekury.springjwt;

public interface JwtService {
    String getToken();
    void validateToken(String token);
}
