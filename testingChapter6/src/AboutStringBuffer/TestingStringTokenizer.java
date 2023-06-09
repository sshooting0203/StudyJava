package AboutStringBuffer;
import java.util.StringTokenizer;
// java.util에 포함 =>import 해야함
// StringTokenizer == 하나의 문자열을 여러 문자열 분리
// String클래스의 split메소드()로 동일한 기능
/*
StringTokenizer(String str) => str스트링 각 문자를 구분문자로 문자열을 분리하는 스트링 토크나이저 생성
StringTokenizer(String str, String delim) => str스트링과 delim 구분문자로 문자열을 분리하는 스트링 토크나이저 생성
StringTokenizer(String str, String delim, boolean returnDelims) => returnDelims가 true이면 delim이 포함된 문자도 토큰에 포함
int countTokens() => 토크나이저가 분리한 토큰의 개수 리턴
boolean hasMoreTokens() => 토크나이저에 다음 토큰이 있으면 true
String nexToken() => 토크나이저에 들어있는 다음 토큰 리턴
 */
public class TestingStringTokenizer {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
//        StringTokenizer st = new StringTokenizer(query,"");
//        StringTokenizer st = new StringTokenizer(query," ");
//        위 2코드 실행결과 동일
        StringTokenizer st = new StringTokenizer(query,"=");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
            //nextToken()은 토큰을 하나씩 소비하면서 처리
        }
        System.out.println(st.countTokens());
        StringTokenizer st2 = new StringTokenizer(query,"=",true);
        System.out.println(st2.countTokens());
        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
