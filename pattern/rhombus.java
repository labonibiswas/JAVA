public class rhombus {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i <= r; i++) {
            for (int j = r - 1; j >= i - r; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}