
class Animal1{

    void eat(){
        System.out.println("Starts eating");
    }
}

class Dogo extends Animal1{
    void eat(){
        System.out.println("eating dogfood");
    }
}

class BabyDogo extends Dogo{

    void eat(){
        System.out.println("eating babydogFood");
    }
}



public class MultilevelPolymorphism {

    public static void main(String[]args){

        Animal1 a1,a2,a3;

        a1 = new Animal1();

        a2 = new Dogo();

        a3 = new BabyDogo();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
