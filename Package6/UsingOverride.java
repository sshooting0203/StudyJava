package Package6;

//public class Main6 {
//    static void paint(Shape p){
//        p.draw();
//        // p가 가리키는 객체 내에 오버라이딩된 draw()호출, 동적바인딩
//        /*paint(Shape S) { s.draw();}
//          paint(Line l) { l.draw(); }
//          paint(Circle c) { c.draw(); }
//          paint(Rectangle r) { r.draw(); }와 동일
//         */
//    }
//    public static void main(String[] args) {
//        Line line = new Line();
//        line.draw(); //Line => 오버라이딩된 메소드 호출
//        // compiletime = Line.draw();
//        // runtime = Line.draw();
//        Shape line2 =  new Line(); //업캐스팅
//        line2.draw(); //Line  => 동적바인딩으로 오버라이딩된 메소드 호출
//        // compiletime = Shape.draw();
//        // runtime = Line.draw();
//        Shape circle = new Circle();
//        circle.draw();
//        // compiletime = Shape.draw();
//        // runtime = Circle.draw();
//    }
//}

//정적(compiletime에) + 바인딩(쌍을 결정) = compiletime에서 확인한것과 runtime에서 실행할 것이 동일
//동적(runtime에) + 바인딩(쌍을 결정) = compiletime에서 확인한 것과 runtime에 실행할 것이 다름
//쌍: 함수 호출문, 실제로 실행될 함수
//overrideing 이외는 모두 정적바인딩

//final메소드 => overriding x
//(가장 상위 클래스의) private메소드 => overriding x
//static메소드를 non-static로 overidingx, 역도 성립


//draw()메소드 overriding
class Shape{
    public Shape next;
    public Shape(){
        next = null;
    }
    public static void draw(){
        System.out.println("super class is Shape!");
    }
}
class Line extends Shape{
//    private void draw(){
//        System.out.println("Line");
//    }
    //compile err => 접근범위를 더 좁게 만들고 있음(public>default>protected>private)
    public static void draw(){
//        super.draw(); //super를 사용하면 상위클래스에서 공통적인 코드를 불러올 수 있음
        // compile err => super로 static 메소드 접근 불가, 인스턴스에 대한 작업만 수행하는 것으로 보임
        System.out.println("Line");
    }
    //static 정적 메소드를 오버라이딩하면 정적바인딩이 되는 이유?
    // 정적 메소드는 클래스 수준에서 호출되는 메소드이기 떄문, 컴파일 시점에 모두 결정됨
}
class Rect extends Shape{
    public static void draw(){
//        super.draw();
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public static void draw(){
//        super.draw();
        System.out.println("Circle");
    }
}
// Override함수를 통해 링크드리스트 LinkedList 구현
public class UsingOverride{
    public static void main(String[] args) {
        Shape start,last,obj;
        // start,last,obj는 모두 Shape으로 선언=>draw()함수 호출시, 오버라이딩 될 수 있음
        start = new Line();
        last = start;
        obj = new Rect();
        last.next = obj;
        last = obj;
        obj = new Line();
        last.next = obj;
        last = obj;
        obj = new Circle();
        last.next = obj;
        Shape p = start;
        // Line => Rect => Line => Circle (노드 별로 타입이 다를 수 있음)
        while(p!=null){
            p.draw();
            p = p.next;
        }
    }
}