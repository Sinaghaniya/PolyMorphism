
class Bike1{
    int speed = 60;
}

class NINJA extends Bike1{
    int speed = 400;
}


public class PolymorphismwithData {

    public static void main(String[]args){

        Bike1 b;

        b = new Bike1();

        System.out.println(b.speed);

        b = new NINJA();

        System.out.println(b.speed);
    }
}
