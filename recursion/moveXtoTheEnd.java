//move all the x in the string to the end

public class moveXtoTheEnd{
    public static void moveX(String str, int idx, int Xcount, String newstr){

        if(idx == str.length()){
            for(int i = 0; i< Xcount; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            Xcount++;
            moveX(str, idx+1, Xcount, newstr);
        }else{
            newstr += currChar;
            moveX(str, idx+1, Xcount, newstr);
        }

    }
    public static void main(String[] args) {
        String str = "abxxcdxexfx";
        moveX(str,0,0,"");
    }
}