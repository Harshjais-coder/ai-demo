public class UserService {

    public String register(String email) {
        if (email.contains("@")) {
            return "success";
        }
        return "invalid";
    }
}