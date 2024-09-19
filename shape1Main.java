package anudipday2;
abstract class Shape{
    abstract  void draw();
}
class Cirlcle extends Shape{
      void draw(){
          System.out.println(" drawing circle ");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println(" drawing Rectangle ");
    }
}
public class shape1Main {
    public static void main(String[] args) {
    Shape s1=new Cirlcle();
    s1.draw();
    Shape s2=new Rectangle();
    s2.draw();
    }}
