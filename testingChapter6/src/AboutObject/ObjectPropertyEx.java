package AboutObject;

/*
Object 클래스 => java.lang 패키지에 포함, 모든 클래스의 수퍼 클래스
boolean eqauls(Object obj) => obj가 기리키는 객체와 현재 객체를 비교하여 내용같으면 true
Class getClass() => 현 객체의 "런타임" 클래스 리턴
int hashCode() => 현 객체에 대한 해시코드 값 리턴
String toSting() => 현 객체에 대한 문자열 표현 리턴
void notify() // 현 객체에 대해 대기하고 있는 하나의 스레드 깨우기
void notifyAll() // 현 객체에 대해 대기하고 있는 모든 스레드 깨우기
void wait() // 다른 스레드가 깨울 때까지 현재 스레드를 대기시킴
* 이 주요 메서드들은 클래스를 새로 생성시, 오버라이드 해야함!
 */
public class ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
//        System.out.println(obj.toString());
//        Point@15db9742 == 함수 오버라이드 안했음
//        AboutObject.Point(2,3) == 함수 오버라이드 함
//        System.out.println(obj);
        //위 2줄은 출력결과가 동일함
        //println() 메서드가 매개변수로 전달된 객체를 출력 시,
        //내부적으로 toString() 메서드를 호출하여 문자열로 변환
//        Point p = new Point(2,4);
//        String s = p + "점";
        //{객체+문자열 => 객체.toString() + 문자열}로 자동변환
    }

    public static void main(String[] args) {
        Point a =  new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);
        if (a==b){
            System.out.println("a==b");
        }
        if(a.equals(b)){
            System.out.println("a is equal to b");
        }
        if(a.equals(c)){
            System.out.println("a is equal to c");
        }
        // equals 오버라이딩 => 내용비교
        // equals 오버라이딩 x => 참조비교
        // equals 오버라이딩 시, 필요하다면 매개변수를 pass할 수 o
    }
}
class Point{
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "AboutObject.Point("+x+","+y+")";
    }
    public boolean equals(Object obj){
        Point p = (Point)obj;
        if( x==p.x && y==p.y){
            return true;
        }
        else return false;
    }
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
/*
byte, short, int, long, char, float, double, boolean
이름이 "Wrapper"인 클래스는 존재하지 않음!
 */