//Q. Reverse a String (using StringBuilder class)

public  class revStr{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int fIndex = i;
            int bIndex = sb.length()-1 -i;
            char fChar = sb.charAt(fIndex);
            char bChar = sb.charAt(bIndex);

            sb.setCharAt(bIndex, fChar);
            sb.setCharAt(fIndex, bChar);

        }

        System.out.println(sb);

        
    }
}