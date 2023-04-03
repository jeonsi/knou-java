public class SwitchTest {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch(n) {     // 비교 조건은 int, String 가능
            case 10:
                System.out.println("10입니다.");
                break;
            case 20:
            case 30:
                System.out.println("20이거나 30입니다");
                break;
            default:
                System.out.println("모르겠습니다.");
                break;
        }
    }
}
