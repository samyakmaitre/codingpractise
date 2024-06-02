public class strings {

    public static boolean palindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }


    public static double dir(String dir){
        int x=0, y=0;
        for(int i=0; i<dir.length();i++){
            if(dir.charAt(i)=='N'){
                y++;
            }
            else if(dir.charAt(i)=='S'){
                y--;
            }
            else if(dir.charAt(i)=='E'){
                x++;
            }
            else if(dir.charAt(i)=='W'){
                x--;
            }
        }

        return Math.sqrt((x*x)+(y*y));
    }

    public static void substring(String S, int si, int ei){
        String Sub = "";
        for(int i=si; i<ei;i++){
            Sub+=S.charAt(i);
            
        }
        System.out.print(Sub);
    }


    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
    
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
    
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
    
        return sb.toString();
    }
    
    public static void main(String args[]) {
        String str = "hi, i am shraddha";
        System.out.println(toUpperCase(str));
    }
    


}
