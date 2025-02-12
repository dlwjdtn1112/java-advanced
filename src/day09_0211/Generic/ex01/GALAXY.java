package day09_0211.Generic.ex01;

public class GALAXY<T> {

    private T model;
    private T name;
    private int count;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
