public class StringSearch {
    public static void main(String[] args) {
        String str1 = "오늘 박찬호 선수의 피칭은 거의 완벽에 가까웠다." + "홈 개막전이 벌어진 12일 선수 소개 때 관중들로부터 유일하게"
            + "야유를 받았던 박찬호가 이날 기립박수를 받으며 마운드를 내려갔다.";
        int index = -1;
        do {
            index = str1.indexOf("박찬호", index + 1);
            if (index >= 0) System.out.println(index + ", ");
        } while (index >= 0);
        index = str1.length();
        do {
            index = str1.lastIndexOf("박찬호", index - 1);
            if (index >= 0) System.out.println(index + ", ");
        } while (index >= 0);
    }
}
