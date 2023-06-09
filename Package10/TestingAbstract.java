package Package10;
/* 추상클래스의 2종류
1. 추상 메소드를 하나라도 가진 메소드
2. 추상 메소드는 없지만 abstract로 선언된 메소드
추상클래스 = abstract class
구체화클래스 = concrete class
 */
public class TestingAbstract {
    public static void main(String[] args) {
        AbstractZero zero;
//        zero = new AbstractZero();
        //compile err => abstract클래스는 구현이 없기 때문에 객체생성불가
        // 생성자를 단독으로 사용해 abstract 객체를 단독으로 생성하는 것 불가
        // abstract 키워드의 역할 => 이 클래스의 객체를 단독으로 생성하지 않을 것임
        // AbstractZero 객체(x) AbstractZero+AbastractThree 객체(O)
        AbstractThree three;
//        three = new AbstractThree();
        //compile err => AbstractThree가 추상클래스인 AbstractZero를 구현했더라도, 여전히 객체를 생성할 수 없음
        // 아마 abstract키워드가 쓰였기 때문인 것 같음!
    }
}
abstract class AbstractZero{
    public abstract String getName();
    public abstract void setName(String s);
}
//1번에 해당
class AbstractOne{
//    abstract public void getAge();
    //compile err => abstract가 아닌 일반클래스에서 abstract 선언 시 err
}
abstract class AbstractTwo{
    public void setAge(){
    }
}
//2번에 해당
abstract class AbstractThree extends AbstractZero{
    public String getName(){
        return "still abstract";
    }
}
//추상 클래스의 상속 => 추상 메소드를 구현하지 않으면=추상클래스, 추상 메소드를 구현 = 추상클래스 아님
class AbstractFour extends AbstractZero{
    private String name;
    public String getName(){
        return "go into real class!";
    }
    public void setName(String s){
        this.name = null;
    }
}