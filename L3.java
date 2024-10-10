import java.util.*;
public class L3 {
    public static int[] midPoint(int x1,int x2,int y1,int y2){
        int midx=(x1+x2)/2;
        int midy=(y1+y2)/2;
        return new int[]{midx,midy};
    }
    public static double length(int x1,int x2,int y1,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();

        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int y3=sc.nextInt();
        int y4=sc.nextInt();

        double length1=length(x1, x2, y1, y2);
        double length2=length(x3, x4, y3, y4);
        if(length1>length2){
            int mid[]=midPoint(x1, x2, y1, y2);
            System.out.print(mid[0]+" "+mid[1]);
        }
        else{
            int mid[]=midPoint(x3, x4, y3, y4);
            System.out.println(mid[0]+" "+mid[1]);
        }
    }
}
