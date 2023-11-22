package lang.print.gaps.task5;

public class ThreeStuckVars {
    public static void main(String[] args) {
        int first = 1;
        String str = String.format("%d", first);
        int second = 10;
        String str1 = String.format("%d", second);
        int third = 100;
        String str2 = String.format("%d", third);
        System.out.println(str + str1 + str2);
    }
}
