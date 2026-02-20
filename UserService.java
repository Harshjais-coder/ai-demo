public class UserService {

    public String register(String email) {

        if (email == null)
            return "invalid";

        if (!email.contains("@"))
            return "invalid";

        return "success";
    }
}