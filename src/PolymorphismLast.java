
class Animalo{

    void eat(){
       System.out.println("Starts Eating");
    }
}

class Dogo1 extends Animalo{

    void eat(){
        System.out.println("Eating DogFood");
    }
}

class BabyDogo1 extends Dogo1{

}

public class PolymorphismLast {

    public static void main(String[]args){


        Animalo a = new BabyDogo1();

        a.eat();

    }
}
