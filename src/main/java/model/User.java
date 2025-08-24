package model;

public class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
