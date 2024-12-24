package data;

public class UserAccount {
    // The UserID format is: {number, number, number, number, letter}
    private final String name;
    private final String username;
    private final String id;

    public UserAccount(String name, String username, String id) {
        if (name == null) {
            throw new IllegalArgumentException("User's name cannot be null.");
        }
        if (username == null) {
            throw new IllegalArgumentException("User's username cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("User's ID cannot be null.");
        }

        if (id.length() != 5) {
            throw new IllegalArgumentException("User's ID must have exactly 5 characters.");
        }

        if (!id.matches("[0-9]{4}[A-Za-z]{1}")) {
            // [0-9] {4} Any number from 0 to 9, exactly 4 of them
            // [A-Za-z] {1} Any letter (uppercase o lowercase), exactly 1 of them
            throw new IllegalArgumentException("Invalid user ID format. Format must be: {NNNNL}, L for letter, N for number.");
        }

        if (id.contains(" ")) {
            throw new IllegalArgumentException("User's ID cannot contain blank spaces.");
        }
        if (username.contains(" ")) {
            throw new IllegalArgumentException("User's username cannot contain blank spaces.");
        }
        if (!name.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException("User's name must contain only letters");
        }

        this.name = name;
        this.username = username;
        this.id = id;
    }

}
