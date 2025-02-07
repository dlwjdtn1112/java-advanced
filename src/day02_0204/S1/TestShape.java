package day02_0204.S1;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0] = new Circle(10,"원");
        shapes[1] = new Rectangle(10,20,"직사각형");


        for (Shape shape : shapes){
            if(shape instanceof Circle){
                System.out.printf("%s의 면적은 %f%n",shape.getName(),shape.area);
            } else if (shape instanceof Rectangle) {
                System.out.printf("%s의 면적은 %.1f%n",shape.getName(),shape.area);


            }
        }
    }
}
