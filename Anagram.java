import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String str, String str1) {
        char arr[]=str.toCharArray();
        char brr[]=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(arr.length==brr.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=brr[i]){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();
        if(isAnagram(str,str2)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is Not Anagram");
        }
    }
}
