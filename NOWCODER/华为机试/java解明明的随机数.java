//方法一:

import java.util.*;

public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList list = new ArrayList();
        int temp;
        for (int i=0;i<N;i++){
            temp=sc.nextInt();
            if (!list.contains(temp)){
                list.add(temp);
            }
        }

        Collections.sort(list);
//        for (int j=0;j<list.size();j++){
//            System.out.println(list.get(j));
//        }
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


//方法二:

import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Set set=new TreeSet();
        while(scan.hasNext()){
            int n=scan.nextInt();
            for(int i=0;i<n;i++)
                set.add(scan.nextInt());
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
