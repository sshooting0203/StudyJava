/*인터페이스를 구현할 때는, 해당되는 추상메서드를 모두 오버라이드 해야함*/
public class InterfaceEx3 {
    public static void main(String[] args) {

    }
}
interface Interface3{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface");
    }
}
interface AnotherInterface{
    void newDefaultMethod();
}
//class Cls2 implements Interface3,AnotherInterface{
// compile err => Cls2라는 클래스가 Interface 2개 모두 구현하고 있지만
// newDefaultMethod를 오버라이드하고 있지 않기 때문(AnotherInterface)
//    @Override
//    public void method(){
//        System.out.println("method() in Cls");
//    }
//}