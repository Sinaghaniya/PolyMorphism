
class Bank{

    float Interest(){

        return 0;
    }

}

class SBI extends Bank{

    float Interest(){
        return 4.5f;
    }
}

class ICICI extends Bank{

    float Interest(){
        return 5.6f;
    }
}

class AXIS extends Bank{

    float Interest(){
        return 6.7f;
    }
}

public class PolyMorphism2 {

    public static void main(String[]args){

        Bank b;

        b = new Bank();

        System.out.println(b.Interest());

        b = new SBI();

        System.out.println(b.Interest());

        b = new ICICI();

        System.out.println(b.Interest());

        b = new AXIS();

        System.out.println(b.Interest());
    }
}
