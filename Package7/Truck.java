package Package7;
class Car{
    protected String name;
    public static void run(){
        go();
    }
    public static void go(){
        System.out.println("Car");
    }
    private void jump(){
        System.out.println("jump!");
    }
    // 주의할 점! : private 접근지정자는 같은 클래스 내에서만 접근가능
}
public class Truck extends Car{
//    @Override
    // compile err => static메서드는 @Override로 annotated 될 수 x
    public static void run(){
        System.out.println("Circle");
    }
//    @Override
    // compile err => private메서드는 @Override로 annotated 될 수 x
    // private 접근지정자가 붙으면 외부 클래스에서는 접근하여 overriding 할 수 x
    private void jump(){}
    // compile err => annotation을 썼음에도 override하지 않으면 err
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}