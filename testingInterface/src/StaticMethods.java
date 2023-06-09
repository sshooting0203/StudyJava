/*
Companion클래스 = Kotlin언어에서 사용되는 개념
Companion객체 = 클래스의 인스턴스를 생성하지 않고도,
해당 클래스의 멤버에 접근할 수 있는 정적인 멤버를 제공
*/
public class StaticMethods {
    public static void main(String[] args) {
        Static obj = new ClsStatic();
//        obj.staticMethod();
        // 클래스 타입.정적메소드() => 접근가능
        Static.staticMethod();
        ClsStatic obj2 = new ClsStatic();
//        obj2.staticMethod();
    }
}
interface Static{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface");
    }
    // default 메서드
    static void staticMethod(){
        System.out.println("staticMethod() in Interface");
    }
    // static 메서드
}
class ClsStatic implements Static{
    @Override
    public void method(){
        System.out.println("method() in ClsStatic");
    }
}