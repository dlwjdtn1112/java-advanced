package day08_0210.API;

public class User implements Cloneable{
    private  int id;
    private  String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User clone() throws CloneNotSupportedException{
        return (User) super.clone();
    }




}
