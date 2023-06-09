package CollideInterface;

public class CollideInterface {
    public static void main(String[] args) {

    }
}
interface InterfaceA {
    void method();
}

interface InterfaceB {
    void method();
}
interface NewInterface extends InterfaceA, InterfaceB{
}
//class MyClass implements InterfaceA, InterfaceB {
//    @Override
//    public void method() {
//        System.out.println("Implementation of method");
//    }
//    public void method(){
//        System.out.println("Another implementation of method");
//    }
    // 메소드 충돌
    // 1. 메소드의 이름 변경
    // 2. 구현하려는 인터페이스들을 다중 상속받는 새로운 인터페이스 정의
//}
class MyClass implements NewInterface{
    public void method(){}
}
