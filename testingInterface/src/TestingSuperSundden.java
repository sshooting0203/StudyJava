public class TestingSuperSundden {
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        System.out.println("After f1");
        f1.pickUp(3);
    }
}
class Fruit{
    private String name;
    Fruit(){
        System.out.println("Making Fruit");
    }
    Fruit(String name){
        this.name = null;
    }
    public void pickUp(int count){
        System.out.print("you picked "+count);
    }
    public void pickDown(int count){
        System.out.print("you have to return "+count);
    }
}
class Apple extends Fruit{
    private String ripedcolor;
    Apple(){
        //int a=0;
//        System.out.println("Why Super has to come first?");
        super();
        // super()은 생성자 첫 줄에 위치해야함
        // 자식클래스의 생성자가 실행되기 전에 부모클래스의 생성자가 먼저 호출되도록 보장
        System.out.println("you didn't set count!");
        super.pickUp(10);
        System.out.println(" Apple!");
    }
    Apple(String color){
        super(color);
    }
    @Override
    public void pickUp(int count){
        //super();
        super.pickUp(count);
        System.out.println(" Apple!");
        System.out.println("----After cultivating----");
        super.pickDown(count);
        System.out.println(" Apple!");
    }

}
class Grape extends Fruit{

}
class Lemon extends Fruit{

}