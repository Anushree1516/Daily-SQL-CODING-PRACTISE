public class ReverseArray {

    static void reverse(){
        int[] arr={9,8,7,6,5,4,3,2,1};
        int l=0;
        int r=arr.length-1;
        while(l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
                   l++;
            r--;
}
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
