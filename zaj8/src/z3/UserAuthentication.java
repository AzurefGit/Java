package z3;

import java.util.Objects;

public class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return Objects.equals(username, "User") && Objects.equals(password, "password");
    }

    @Override
    public void logout() {
        System.out.println("Pomyślne wylogowanie");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(Objects.equals(username, "User") && Objects.equals(oldPassword, "password")){
            oldPassword = newPassword;
            return true;
        }
        return false;
    }

}
