import java.util.*;

public class FindCommonIDs {
    public static Set<Integer> func(List<Set<Integer>> list){
        Set<Integer> set=new HashSet<>(list.get(0));
        for(int i=1;i<list.size();i++){
            set.retainAll(list.get(i));
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Set<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<count;j++){
                set.add(sc.nextInt());
            }
            list.add(set);
        }
        Set<Integer> common=func(list);
        if(common.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(common);
        }
    }
}
