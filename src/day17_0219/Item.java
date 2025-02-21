package day17_0219;

public class Item {
    private int id;
    private String name;
    private String author;

    public Item(int id,String name,String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Item(){}

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
