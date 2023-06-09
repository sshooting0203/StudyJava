/*
Java 7
-Costants
-Abstract methods
+Java 8
-Default methods
-Static methods
하위 호환성 => Java2의 코드를 Java10에 실행시켜도 돌아감
Java 8부터 functional programming 함수형 프로그래밍 도입
새로운 메소드를 추가하기 위해 default methods 탄생!
+Java 9
-Private methods
-Private Static methods
 */
public class InterfaceEx {
    public static void main(String[] args) {
        Interface obj1 =  new Implementation();
        obj1.method();
        obj1.newDefaultMethod();
        Implementation obj2 = new Implementation();
        obj2.method();
        obj2.newDefaultMethod2();
        SubInterface obj3 = new SubImplementation();
        obj3.method();
        obj3.newDefaultMethod();
        Implementation obj4 = new Implementation();
        obj4.method();
        obj4.newDefaultMethod();
    }
}
interface Interface{
    void method();
    public default void newDefaultMethod2(){
        System.out.println("newDefaultMethod()2 in Interface!");
    }
    default public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface!");
    }
    // public의 위치 default와 서로 바뀌어도 ok
}
interface SubInterface extends Interface{
    void method();
    @Override
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in SubInteface");
    }
}
class SubImplementation implements SubInterface{
    @Override
    public void method(){
        //Interface.super.newDefaultMethod();
        // compile err => Interace라고 지정했으므로 호출가능하지 않냐?
        // 정확하게 지정해주지 않으면 Interface인지, SubInterface인지 인식x
        // SubInterface.super.newDefaultMethod();
        System.out.println("method() in SubImClass");
    }
}
class SuperImplementation {
    public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in SuperImClass");
    }
}
class Implementation extends SuperImplementation implements Interface{
    @Override
    public void method(){
        System.out.println("method() in ImClass");
    }
    @Override
    public void newDefaultMethod(){
        //super.newDefaultMethod();
        //compile err
        // => super.메소드 = 부모 클래스로 찾아 올라가는 것
        // => 인터페이스이름.super.메소드 = 위치를 확실하게 지정
        Interface.super.newDefaultMethod();
        System.out.println("newDefaultMethod() in ImClass");
        // default method도 override 가능함
    }
}