package day01_0203.SHAPE;

public  class Circle1 extends Shape1{
    double radius;

    Circle1(double radius,String name){
        super();
        this.radius = radius;
    }

    @Override
    public void calculationArea(){
        double area = Math.PI * radius;
        System.out.println("면적은 "+ area);

    }
}
