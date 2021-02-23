import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String password;
    private boolean isHandicap;
    private String typeofDisability;
    private String severity;
}