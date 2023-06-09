/*클래스를 상속받고, 인터페이스를 구현하는 것을 동시에 했을 떄, 메서드 실행방향*/
public class InterfaceEx2 {
    public static void main(String[] args) {
        Cls obj = new Cls();
        obj.method();
        obj.newDefaultMethod();
        // Cls에 newDefaultMethod가 따로 구현되있지 않은 상태에서 불러오기
        // => 상속받은 newDefaultMethod냐, 구현한 interface에서 가져온 newDefaultMethod냐
        // Interface가 답임 => Interface를 오버라이딩과 유사하게 보기
        Interface2 obj2 = new Cls();
        obj2.method();
        obj2.newDefaultMethod();
    }
}
interface Interface2{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod() in Interface");
    }
}
class SuperCls{
    public void newDefaultMethod(){
        System.out.println("newDefaultMethod() in SuperCls");
    }
}
class Cls extends SuperCls implements Interface2{
    @Override
    public void method(){
        System.out.println("method() in Cls");
    }
}