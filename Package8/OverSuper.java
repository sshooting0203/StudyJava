package Package8;

public class OverSuper {
    public static void main(String[] args) {
        Clothes c = new Hat();
        c.putOn();
        c.pickUp();
    }
}
class Clothes{
    protected String name;
    public void putOn(){
        goOn();
    }
    public void goOn(){
        System.out.println(name);
    }
    public void pickUp(){
        System.out.println("Let's pick up!");
    }
}
class Hat extends Clothes{
    protected String name;
    @Override
    public void goOn(){
        name = "Hat";
        super.name = "Clothes";
        super.goOn();
        //super를 상위 객체로 생각하면, Clothes의 goOn()함수를 찾아간 것이므로 정적바인딩
        //super를 붙이는 역할 => 상위 객체부터 찾겠다
        System.out.println(name);
    }
    public void pickUp(){
        super.pickUp();
    }
    // 이런 코드는 overriding의 의미가 x
}