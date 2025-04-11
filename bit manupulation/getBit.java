public class getBit{
    public static void main(String[] args) {
        int n = 10; //1010
        int i = 0; //i=position
        int bm = 1<<i; // bm means bit mask

        if((bm & n) == 0){
            System.out.println("it is a zero bit");
        }else{
            System.out.println("it is a non zero bit");
        }
    }
}