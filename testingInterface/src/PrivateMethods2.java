/*
기본적으로 인터페이스의 메서드 접근 지정자 = public
Java9부터 접근 지정자를 private으로 사용가능
private => 인터페이스 내에서만 불러올 수 있음, 구현 클래스에서 접근 불가능
 */
public class PrivateMethods2 {
}
//Interface10은 privateMethod + staticMethod
interface Interface10{
//    private static default void privateStaticDefaultMethod(){}
//    private과 static는 동시에 사용 가능
//    private과 default는 동시에 사용불가능(둘 다 접근 지정자이기 때문에 하나만 선택)
//    default와 static은 동시에 사용불가능
//    (default로 지정하면 구현하는 클래스에서 Override가능, 하지만 static으로 지정시 구현하는 클래스에서 바꿀 수 없음)
    static void staticMethod(){
        privateStaticMethod1();
    }
    private static void privateStaticMethod1(){
//        method();
//        defaultMethod();
//        privateMethod();
        // compile err
        // 위 3개의 메소드는 모두 non-static 메소드이므로 접근 불가
        privateStaticMethod2();
        staticMethod();
    }
    private static void privateStaticMethod2(){
        privateStaticMethod1();
    }
    void method();
    default void defaultMethod(){}
    private void privateMethod(){}
}
class Cls10 implements Interface10{
    @Override
    public void method(){
//        privateStaticMethod1();
//        private이 붙었으므로 인터페이스 내에서만 사용가능
    }
}