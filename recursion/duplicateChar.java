//remove all duplicate charecter from the string

public class duplicateChar{
    public static boolean map[] = new boolean[26];

    public static void remDup(String str, int idx, String newStr){

        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            remDup(str, idx+1, newStr);
        }else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            remDup(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbcddmm";
        remDup(str,0,"");
    }
}