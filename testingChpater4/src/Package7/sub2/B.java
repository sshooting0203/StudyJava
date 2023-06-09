//import java.util.*;
//import문은 패키지 선언 바로 다음에 작성
//java패키지의 util패키지의 모든 클래스를 import

package Package7.sub2;
//import java.util;
//import 안 되는 이유? => 패키지 전체를 import할 수 없음, 패키지 내의 클래스를 import해야함
import java.util.ArrayList;
import java.util.List;
// 한 줄 안에 여러 개의 패키지를 import 불가능
// 여러 줄에 걸쳐서 패키지를 import 해야함
public class B {
    static void use(){
        System.out.println("You can use function without refer!");
        ArrayList newArr = new ArrayList(5);
        List newList;
    }
}
