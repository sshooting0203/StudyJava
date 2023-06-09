/* 클래스가 추상클래스와 Interface를 동시에 상속받았을 때*/
public class InterfaceEx8 {
    public static void main(String[] args) {
        Cls8 obj = new Cls8();
        obj.method();
        obj.newDefaultMethod();
    }
}
interface Interface8{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface8");
    }
}
abstract class AbstractClass{
    abstract void newDefaultMethod();
}
class Cls8 extends AbstractClass implements Interface{
    @Override
    public void method(){
        System.out.println("method() in Cls8");
    }
    @Override
    public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Cls8");
    }
}
