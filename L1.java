import java.util.*;
public class L1 {
    public static void rev(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static int evenAvg(int arr[]){
        int sum=0;
        int count=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
                count++;
            }
        }
        avg=sum/count;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        System.out.println(list.reversed());
        int even=0;
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                even+=list.get(i);
                count++;
            }
        }
        int avg=even/count;
        System.out.println(avg);
    }
}
