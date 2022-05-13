/** in this program we are ovverloading the method
 * void run()
 * and upcasting the class Bike bike = new Splendor()
 */

class Bike{

    void run(){
        System.out.println("Starts running");
    }
}

class Splendor extends Bike{

    void run(){
        System.out.println("running Safely ");
    }
}


public class PolyMorphism {

    public static void main(String[]args){

       Bike b = new Splendor();

       b.run();

    }
}
