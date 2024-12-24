package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testUserAccount {

    @Test
    public void nullName() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount(null, "username", "1234A"), "User's name cannot be null.");
    }

    @Test
    public void nullUsername() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", null, "1234A"), "User's username cannot be null.");
    }

    @Test
    public void nullID() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", null), "User's ID cannot be null.");
    }

    @Test
    public void invalidIDLengthLess() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "123A"), "User's ID must have exactly 5 characters.");
    }

    @Test
    public void invalidIDLengthMore() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "12345AB"), "User's ID must have exactly 5 characters.");
    }

    @Test
    public void invalidIDFormat() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "123AB"), "Invalid user ID format. Format must be: {NNNNL}, L for letter, N for number.");
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "A1234"), "Invalid user ID format. Format must be: {NNNNL}, L for letter, N for number.");
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "ABCDE"), "Invalid user ID format. Format must be: {NNNNL}, L for letter, N for number.");
    }

    @Test
    public void containsBlankSpaceInID() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "username", "1234 A"), "User's ID cannot contain blank spaces.");
    }

    @Test
    public void containsBlankSpaceInUsername() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna", "user name", "1234A"), "User's username cannot contain blank spaces.");
    }

    @Test
    public void invalidNameFormat() {
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna123", "username", "1234A"), "User's name must contain only letters");
        assertThrows(IllegalArgumentException.class, () -> new UserAccount("Edna S", "username", "1234A"), "User's name must contain only letters");
    }

    @Test
    public void validUserAccount() {
        assertDoesNotThrow(() -> new UserAccount("Edna", "username", "1234A"), "Valid UserAccount, no exception expected");
    }
}