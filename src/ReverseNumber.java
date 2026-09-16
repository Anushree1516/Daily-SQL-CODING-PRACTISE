public class ReverseNumber {

    static void reversenumber(){
        int n=456;
        int rev=0;

        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println();
        System.out.println(rev);

    }
}
