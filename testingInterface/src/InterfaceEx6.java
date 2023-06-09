/* 다양한 레퍼런스 타입의 변수로 메서드를 가리켰을 때,
인터페이스의 구현이 달라지면 일어나는 일*/
public class InterfaceEx6 {
    public static void main(String[] args) {
        Cls6 obj = new Cls6();
        obj.method();
        obj.newDefaultMethod();
        Interface6 obj2 = new Cls6();
        obj2.method();
        obj2.newDefaultMethod();
        AnotherInterface4 obj3 = new Cls6();
        //obj3.method();
        //compile err => Cls5가 2개의 Interface를 상속받았는데,
        //하나는 method라는 추상메서드가 있고, 하나는 없기 때문에
        //Override했더라도, 탐색불가능
        obj3.newDefaultMethod();
    }
}
interface Interface6{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface6");
    }
}
interface AnotherInterface4{
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in AnotherInterface4");
    }
}
class Cls6 implements Interface6,AnotherInterface4{
    @Override
    public void method(){
        System.out.println("method() in Cls5");
    }
    @Override
    public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Cls5");
    }
}
// 이렇게 CLs5에서 newDefaultMethod를 오버라이드 하면, compiler가 확실히 인식가능