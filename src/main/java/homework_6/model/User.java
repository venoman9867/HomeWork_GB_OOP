package homework_6.model;

public abstract class User {
    private static int counter;
    private int id;
    private String name;

    public User(String name) {
        this.name = name;
        id=counter;
        counter++;
    }

    public String getName() {
        return name;
    }


}
