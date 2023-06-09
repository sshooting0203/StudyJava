/*이름이 같은 메서드가 같은 계층의 인터페이스에 있는 경우 오류*/
public class InterfaceEx5 {
    public static void main(String[] args) {

    }
}
interface Interface5{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface5");
    }
}
interface AnotherInterface3{
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in AnotherInterface3");
    }
}
//class Cls4 implements Interface5,AnotherInterface3{
//    @Override
//    public void method(){
//        System.out.println("method() in Cls4");
//    }
//}
//compile err => Cls4()생성자로 객체를 생성하고 newDefaultMethod를
// 불러오게 되면 무엇을 실행시켜야 할지 분간하지 x