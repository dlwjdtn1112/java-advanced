package day01_0203.SHAPE;

public abstract class Shape1 {
    private double area;
    private String name;

    Shape1(){}
    Shape1(String name){
        //this.area = area;
        this.name = name;
    }

    public abstract void calculationArea();
    public void print(){
        calculationArea();
    }
}
