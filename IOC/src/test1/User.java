package test1;

public class User {
    String name;
    String id;

    public User() {
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{"+"name='"+name+'\''+", id='"+id + '\'' + '}';
    }
}
