/**
 * Created by CHJ on 2017-05-19.
 */
public class practice {
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);

            if(num==6){ //while 문을 멈추는 코드
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}