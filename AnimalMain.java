package anudipday2;
class Animal{
    public void makeSoung(){
        System.out.println(" Animals are making noise ");
    }
}
class Dog extends Animal{
    @Override
    public void makeSoung() {
//        super.makeSoung();
        System.out.println("\"bark\" or \"woof.\"");
    }
}
class Cat extends Animal{
    @Override
    public void makeSoung() {
      super.makeSoung();
        System.out.println("\"meow.\" ");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
   Cat c=new Cat();
   c.makeSoung();
//   Dog d=new Dog();
//   d.makeSoung();

    }
}
