
class Shape{

    void draw(){
        System.out.println("Draws");
    }
}
class Rectangle extends Shape{

    void draw(){
        System.out.println("Draws Rectangle");
    }
}

class Square extends Shape{

    void draw(){

        System.out.println("draws Square");
    }
}

class Circle extends Shape{

    void draw(){
        System.out.println("draws Circle");
    }
}

public class PolyMorphism3 {

    public static void main(String[]args){

        Shape shape;

        shape = new Shape();

        shape.draw();

        shape = new Rectangle();

        shape.draw();

        shape = new Square();

        shape.draw();

        shape = new Circle();

        shape.draw();
    }
}
