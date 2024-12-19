package z3;

import java.util.Objects;

public class AdminAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        return Objects.equals(username, "Admin") && Objects.equals(password, "admin");
    }

    @Override
    public void logout() {
        System.out.println("Pomyślne wylogowanie");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(Objects.equals(username, "Admin") && Objects.equals(oldPassword, "admin")){
            oldPassword = newPassword;
            return true;
        }
        return false;
    }
}
