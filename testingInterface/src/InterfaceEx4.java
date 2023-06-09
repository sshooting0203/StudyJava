/* 생성자의 타입에 따라 실제 함수가 실행됨*/
public class InterfaceEx4 {
    public static void main(String[] args) {
        Cls4 obj = new Cls4();
        obj.method();
        obj.newDefaultMethod();
        Interface4 obj2 = new Cls4();
        obj.method();
        obj.newDefaultMethod();
        AnotherInterface2 obj3 = new Cls4();
        obj.method();
        obj.newDefaultMethod();
    }
}
interface Interface4{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in interface4");
    }
}
interface AnotherInterface2{
    void newDefaultMethod();
}
class Cls4 implements Interface4,AnotherInterface2{
    @Override
    public void method(){
        System.out.println("method() in Cls3");
    }
    // AnotherInterface2의 입장에서는 추상 메서드를 구현
    // Interface4의 입장에서는 @Override에 해당
    // 인스턴스의 실제 타입에 따라 함수가 실행됨 => 위에서는 모두 Cls3()생성자로 객체를 생성했기 때문
    @Override
    public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Cls3");
    }
}