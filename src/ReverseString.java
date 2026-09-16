public class ReverseString {

    static void reverseString(){
        String s="mathematics";

        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println();
        System.out.println(rev);
    }
}
