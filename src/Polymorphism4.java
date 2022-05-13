
class Animal{

    void eat(){
        System.out.println("starts eating");
    }
}

class dog extends Animal{

    void eat(){
        System.out.println("eating dogFood");
    }
}

class cat extends Animal{

    void eat(){
        System.out.println("eating CatFood");
    }
}

class lion extends Animal{

    void eat(){
        System.out.println("eating Meat");
    }
}

public class Polymorphism4 {

    public static void main(String[]args){

        Animal a;

        a = new Animal();

        a.eat();

        a = new dog();

        a.eat();

        a = new cat();

        a.eat();

        a = new lion();

        a.eat();
    }
}
