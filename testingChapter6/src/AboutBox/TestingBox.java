package AboutBox;

/*
boxing = (기본타입 => Wrapper타입)
Integer ten = 10; => 레퍼런스타입 != 원시타입
Integer ten = Integer.valueOf(10);
// boxing
int n = ten;
int n = ten.intValue();
// unboxing
 */
public class TestingBox {
    public static void main(String[] args) {
        boxFunction box = new boxFunction();
        Integer test1 = Integer.valueOf(5);
//        Integer test2 = new Integer(10);
//        java 9부터 생성자를 이용한 Wrapper 객체 생성폐기 => 컴파일+실행은(o)
        Integer test3 = Integer.valueOf("10");
//        문자열에서 숫자로 변환하는 시간이 추가됨 => 내부적으로 parseInt()메서드 호출
//        Integer test4 = Integer.valueOf("null");
//        NumberFormatException
//        Float f = Float.valueOf(3.14);
        // FLoat.valueof() 메서드는 인자로 float or String만
        int i = Integer.parseInt("1234");
        // Integer.parseInt(문자열)은 Integer로 boxing이 일어나지x, 바로 int로
        box.add(7);
        // 매개변수에 Integer타입이 아닌 Int타입이 들어갔음에도 자동으로 boxing 일어남
        // autoboxing
        int i2 = box.get(1);
        System.out.println(i);
        // 반환값이 Integer타입임에도 Int타입으로 들어갈 수 있음
        // autounboxing
    }
}
class boxFunction {
    public void add(Integer e1) {
        System.out.println(e1);
    }
    public Integer get(int e2) {
        Integer testtest = Integer.valueOf(3);
        return testtest;
    }
}
/*
static int bitCount(int i) => 정수 i의 이진수 표현에서의 1의 개수 리턴
float floatValue() => float타입으로 값리턴
int intValue() => int타입으로 값리턴
long longValue() => long타입으로 값리턴
short shortValue() => short타입으로 값리턴
static int parseInt(String s) 문자열 s를 10진 정수로 변환한 값 리턴
static int parseInt(String s, int radix)
static String toBinaryString(int i) 정수 i를 이진수 표현으로 변환한 문자열 리턴
static String toHexString(int i) 정수 i를 16진수 표현으로 변환한 문자열 리턴
static String toOctalString(int i) 정수 i를 8진수 표현으로 변환한 문자열 리턴
static String toString(int i) 정수 i를 문자열로 변환하여 리턴
static Integer valueOf(int i) 정수 i를 담은 Integer 객체리턴
static Integer valueOf(String s) 문자열 s를 정수로 변환하여 담고 있는 Integer 객체리턴
 */