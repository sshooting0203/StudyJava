package AboutStringBuffer;
// java.lang에 포함
// String 클래스와 달리 문자열 변경가능
/*
StringBuffer() => 초기 버퍼의 크기가 16인 스트링버퍼 객체 생성
StringBuffer(charSequence seq) => seq가 지정하는 일련의 문자들을 포함하는 스트링 버퍼생성
StringBuffer(int capacity) => 지정된 초기 크기를 갖는 스트링버퍼 객체생성
StringBuffer(String str) => 지정된 스트링으로 초기화된 스트링버퍼 객체 생성
 */
public class TestingStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.setLength(20);
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //16
        sb2.setLength(20);
        System.out.println(sb2.length()); //20
    }
}
// StringBuffer => Multi-thread == 동기화 == thread-safe
// StringBuilder => Single-thread == 동기화x == thread-unsafe
/*
StringBuffer append(String str) => str 스트링을 스트링 버퍼에 덧붙임
STringBuffer append(StringBuffer ab) => sb 스트링버퍼를 스트링버퍼에 덧붙입
int capacity() => 스트링 버퍼의 현재 크기 리턴
int length() => 스트링 버퍼의 길이 리턴
StringBuffer delete(int start,int end) => start 위치에서 end 위치 앞까지 부분 문자열 삭제
StringBuffer insert(int offset, String str) => str 스트링을 스트링 버퍼의 offset위치에 삽입
StringBuffer replace(int start,int end, String str) => 스트링 버퍼 내 start 위치의 문자부터 end가 지정하는 문자 앞의
서브 스트링을 str로 대치
StringBuffer reverse() => 스트링 버퍼 내 문자들을 반대 순서로 변경
void setLength(int newLength) => 스트링 버퍼 내 문자열 길이를 newLength로 재설정,
현재 길이보다 큰 경우 널문자로 채우며, 작은 경우 기존 문자열이 잘림
 */