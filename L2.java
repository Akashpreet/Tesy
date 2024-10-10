import java.util.*;
public class L2 {
    public static void main(String[] args) {
        int arr1[]={5,4,9,1,3,7};
        int arr2[]={1,2,3,4,5,6};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
