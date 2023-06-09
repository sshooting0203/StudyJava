package Package3;
class Circle{
    int radius;
    void set(int r){radius=r;}
    double getArea(){return 3.14*radius*radius;}
    public Circle(int radius){
        radius = radius;
        // radius매개변수에 radius를 대입
    }
    // 컴파일 + 실행(o)
    // this.radius = radius;와 radius = radius;는 다름
    // this.radius = radius는 이 객체의 radius 매개변수에 radius를 대입
}
public class Chapter4_3 {
    public static void main(String[] args) {
//        Circle pizza = new Circle();
        // 선언되어있는 생성자가 있으므로 기본생성자가 구현되어 있지 않음!
        Circle donut = new Circle(3);
        System.out.println(donut);
        System.out.println(donut.radius);
        Circle ob1 = new Circle(1);
        Circle ob2 = new Circle(2);
        Circle ob3;
        ob3 = ob2;
        //ob3 레퍼런스 변수가 ob2와 같은 곳을 가리킴
        //java에서는 여러 레퍼런스 변수가 한 객체를 가리킬 수 있음
        Circle [] arr;
        arr = new Circle[5];
        for (int i=0;i<arr.length;i++){
            arr[i] = new Circle(i);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].getArea());
        }
    }
}
