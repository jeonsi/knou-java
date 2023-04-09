public class WrapperTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        byte b = Byte.parseByte("8");
        short s = Short.parseShort("12");
        int n = Integer.parseInt("123");
        long l = Long.parseLong("1234");
        float f = Float.parseFloat("12.3");
        double d = Double.parseDouble("1.23E2");

        Byte b2 = new Byte((byte)10);     // 기본형 데이터 박싱. Constructor 방식은 deprecated 됨
        Byte b3 = new Byte("10");         // 문자열 박싱. Constructor 방식은 deprecated 됨
        Byte b4 = Byte.valueOf((byte)10);

        int i = b4.intValue();          // object unboxing

        String str = Byte.toString((byte)3);
        str = Short.toString((short)3);
        str = Integer.toString(4);
        str = Long.toString(5);
        str = Float.toString(1.34f);
        str = Double.toString(1.234);

        str = String.valueOf(3);
        str = String.valueOf(1.34);

        // 자동 박싱 : 동일 유형의 기본형과 이에 상응하는 포장 클래스 사이에는 자동으로 박싱과 언박싱이 이루어진다.
        Integer obj = 100;

        // 자동 언박싱
        int val1 = obj;
        int val2 = obj + 100;
    }
}
