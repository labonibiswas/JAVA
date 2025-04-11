
public class clearBit{
    public static void main(String[] args) {
        int n = 5; //0101
        int i = 0; //i=position
        int bm = 1<<i; // bm means bit mask
        int notbm = ~(bm);
        int newNum = notbm & n;
        System.out.println(newNum);
    }
}