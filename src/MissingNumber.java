public class MissingNumber {

    public static void missingNumber(){
        int[] arr = {1, 2, 4, 5, 6};
        int n=arr.length+1;
        int a_sum=0;
        int t_sum=0;
        t_sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            a_sum+=arr[i];
        }
        int miss=t_sum-a_sum;
        System.out.println("missing number is"+" :"+miss);
    }
}
