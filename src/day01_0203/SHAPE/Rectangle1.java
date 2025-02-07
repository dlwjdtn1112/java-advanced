package day01_0203.SHAPE;

public  class Rectangle1 extends Shape1{
    double width;
    double height;
    //Rectangle1(){}
    Rectangle1(double width, double height){
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculationArea(){
        double result = width*height;
        System.out.println("넓이는 : "+ result);
    }
}
