/* 
----super()----
부모 클래스의 생성자를 호출하는 특수한 형태의 메소드
생성자 내에서만 사용가능!(부모클래스의 생성자를 호출하는 용도임)
첫 줄에만 위치가능
----super.메소드이름()----
부모클래스의 인스턴스 메소드를 호출하는 특수한 형태의 메소드
해당 메소드가 부모 클래스의 인스턴스 메소드인 경우에만 사용가능
생성자, 메소드 모두 사용가능
모든 줄에 위치가능
 */
public class InterfaceEx7 {
    public static void main(String[] args) {
        Cls7 obj = new Cls7();
        obj.method();
        obj.newDefaultMethod();
        Interface7 obj2 = new Cls7();
        obj2.method();
        obj2.newDefaultMethod();
        AnotherInterface5 obj3 = new Cls7();
        //obj3.method();
        obj3.newDefaultMethod();
    }
}
interface Interface7{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface7");
    }
}
interface AnotherInterface5{
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in AnotherInterface5");
    }
}
class Cls7 implements Interface7,AnotherInterface5{
    @Override
    public void method(){
        System.out.println("method() in Cls7");
    }
    @Override
    public void newDefaultMethod(){
        Interface7.super.newDefaultMethod();
        AnotherInterface5.super.newDefaultMethod();
        // 같은 계층의 newDefaultMethod호출
        System.out.println("newDefaultMethod() in Cls7");
    }
}
