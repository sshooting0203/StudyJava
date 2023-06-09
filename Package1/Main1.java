package Package1;
public class Main1 {
    public static void main(String[] args) {
        ColorPoint cp;
        cp = new ColorPoint(5,6,"blue");
//        cp.showColorPoint();
//        new Point();
//        new ColorPoint(1,2,"pink");
//        Point pt;
//        모두 실행가능
//err     ColorPoint ptt = new Point();
//no err  Point pttt = new ColorPoint(3,4,"red");
//        상위 타입 참조변수로 하위타입 가리킬 수 있음
    }
}
class Point{
    private int x,y;
    public Point(){
        this.x = x;
        this.y = y;
//err     this.showColorPoint();
//        this는 Point객체를 가리키기 때문에, 자식클래스의 메소드를 호출할 수 없음
//no err  ColorPoint.showColorPoint();
//        static 메소드를 호출했기 때문에, 자식클래스의 메소드에도 접근 가능
//        System.out.println(ColorPoint.color);
//no err  같은 패키지 내에 있기 때문에 private 멤버변수만 아니라면 접근 가능
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Point 출력");
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint extends Point {
//    자바는 다중상속 불가능, 상속횟수 무제한
//    최상위 조상 클래스 => java.lang.Object
    static String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        System.out.println("super 실시");
        this.color=color;
        System.out.println("ColorPoint 출력");
//no err this.showPoint();
//       this가 가리키는 것이 ColorPoint 객체이므로, 이 객체 내애서 없다면, 상위클래스에서 조회 후 실행
    }
    public static void showColorPoint(){
        System.out.println(color);
//        다만 static 메소드에서는 non-static 메소드와 필드는 사용불가
//err     this.showPoint();
//        static 메소드는 객체가 생성되어있는 상태가 아니므로 this 사용불가
    }
}
