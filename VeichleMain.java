package anudipday2;
class Viechle{
    public void start(){
        System.out.println(" starting a viechle ");
    }
    public void stop(){
        System.out.println(" stoping a viechle ");
    }

}
class Car extends Viechle{
    @Override
    public void start() {
        //super.start();
        System.out.println("car is starting ");
    }

    @Override
    public void stop() {
        System.out.println("car is stoping ");
    }
}

class Bike extends  Viechle{
    @Override
    public void start() {
        //super.start();
        System.out.println("bike is starting ");
    }

    @Override
    public void stop() {
        System.out.println("bike is stoping ");
    }

}
public class VeichleMain {
    public static void main(String[] args) {
 Bike b=new Bike();
 b.start();
 b.stop();
 Car c=new  Car();
 c.start();
 c.stop();

    }
}
