package Algorithm_Training;
/*
题目描述
数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

输入描述:
先输入键值对的个数
然后输入成对的index和value值，以空格隔开

输出描述:
输出合并后的键值对（多行）

示例1
输入
4
0 1
0 2
1 2
3 4
输出
0 3
1 2
3 4
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class 合并表记录 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            for (int i=0;i<N;i++){
                int key=sc.nextInt();
                int value=sc.nextInt();
                if (map.containsKey(key)){
                    value=map.get(key)+value;
                    map.put(key,value);
                }
                else{
                    map.put(key,value);
                }
            }
            for (Integer key:map.keySet()){
                System.out.println(key+" "+map.get(key));
            }
        }
    }
}
