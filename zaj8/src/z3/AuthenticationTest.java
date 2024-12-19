package z3;

public class AuthenticationTest {

    public static void main(String[] args) {
        Authentication userAuth = new UserAuthentication();
        System.out.println(userAuth.login("User", "password"));
        System.out.println(userAuth.resetPassword("User", "password", "password123"));
        userAuth.logout();

        System.out.println();

        Authentication adminAuth = new AdminAuthentication();
        System.out.println(adminAuth.login("Admin", "admin"));
        System.out.println(adminAuth.resetPassword("Admin", "admin", "admin123"));
        userAuth.logout();
    }
}
