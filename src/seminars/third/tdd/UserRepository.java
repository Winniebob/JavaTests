package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       //..
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAllUsers() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.isAuthenticateOut();
            } else{
                user.isAuthenticateIn();
            }

        }
    }
    @Test
    public void testLogoutAllUsers() {
        UserRepository userRepository = new UserRepository();
        User adminUser = new User("Admin", "2222",true);
        User regularUser1 = new User("User1", "31231",false);
        User regularUser2 = new User("User2", "232323", false);

        addUser(adminUser);
        addUser(regularUser1);
        addUser(regularUser2);

        assertTrue(findByName("Admin"));

        logoutAllUsers();

        assertTrue(adminUser.isAuthenticate());
        assertFalse(regularUser1.isAuthenticate());
        assertFalse(regularUser2.isAuthenticate());
    }
}