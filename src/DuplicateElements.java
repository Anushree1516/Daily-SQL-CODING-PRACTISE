import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void duplicate(){
        int[] arr= {1,2,3,3,4,1};
        Set<Integer> st1=new HashSet<>();
        Set<Integer> st2=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!st1.add(arr[i])){
                System.out.print(arr[i]+",");
            }
        }
    }
}
