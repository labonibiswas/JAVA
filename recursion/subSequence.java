//print all the sub-sequence of a string. sub-sequence = 2^n (n= no. of char in the string)

public class subSequence{

    public static void subSeq(String str, int idx, String newStr) {
        

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        //include current
        subSeq(str, idx+1, newStr + currChar);

        //excclude 
        subSeq(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}