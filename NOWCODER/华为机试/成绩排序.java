package Algorithm_Training;

/*
题目描述
查找和排序

题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
      都按先录入排列在前的规则处理。

   例示：
   jack      70
   peter     96
   Tom       70
   smith     67

   从高到低  成绩
   peter     96
   jack      70
   Tom       70
   smith     67

   从低到高

   smith     67

   Tom       70
   jack      70
   peter     96

输入描述:
输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开

输出描述:
按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开

示例1
输入
复制
3
0
fang 90
yang 50
ning 70
输出
复制
fang 90
ning 70
yang 50
 */

//Java 思路
//按插入顺序读，可以用LinkedHashMap

// 有重复的名字，重复的分数 所以用 name + " " + score 做key，用score做value

//先将分数排序，再遍历分数（该分数i只找一次）

//每次从LinkedHashMap中遍历，找到与i相等的key

import java.util.*;
public class 成绩排序 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int order = sc.nextInt();
            ArrayList<Integer> list = new ArrayList();
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int score = sc.nextInt();
                list.add(score);
                map.put(name + " " + score, score);
            }
            Collections.sort(list);
            if (order == 0)
                Collections.reverse(list);
            int pre = -1;
            for (int i : list) {
                if (pre == i)
                    continue;
                for (String key : map.keySet())
                    if (map.get(key).equals(i))
                        System.out.println(key);
                pre = i;
            }
        }
    }
}
