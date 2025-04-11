public class setBit{
    public static void main(String[] args) {
        int n = 5; // 0101
        int i = 2; //i=position
        int bm = i<<i; // bm means bit mask
        int newNum = n | bm;
        System.out.println(newNum);
    }
}