package Algorithm_Training;
/*
题目描述
题目标题：

将两个整型数组按照升序合并，并且过滤掉重复数组元素[注: 题目更新了。输出之后有换行]

详细描述：

接口说明

原型：

voidCombineBySort(int* pArray1,intiArray1Num,int* pArray2,intiArray2Num,int* pOutputArray,int* iOutputNum);

输入参数：

int* pArray1 ：整型数组1

intiArray1Num：数组1元素个数

int* pArray2 ：整型数组2

intiArray2Num：数组2元素个数

输出参数（指针指向的内存区域保证有效）：

int* pOutputArray：合并后的数组

int* iOutputNum：合并后数组元素个数

返回值：

void



输入描述:
输入说明，按下列顺序输入：
1 输入第一个数组的个数
2 输入第一个数组的数值
3 输入第二个数组的个数
4 输入第二个数组的数值

输出描述:
输出合并之后的数组

示例1
输入
3
1 2 5
4
-1 0 3 2
输出
-101235
 */
import java.util.*;

public class 整形数组合并 {
    public static void main(String[] args) {
        //方法二:集合框架Set
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num1 = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for(int i=0;i<num1;i++){
                set.add(sc.nextInt());
            }
            int num2 = sc.nextInt();
            for(int i=0;i<num2;i++){
                set.add(sc.nextInt());
            }
            for(int temp:set){
                System.out.print(temp);
            }
            System.out.println();
        }
        sc.close();


        //方法一:不知道为什么不能通过,在自己的idea上可以
/*        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        Set set = new HashSet();
        while(sc.hasNext()){
            int n1=sc.nextInt();
            for (int i=0;i<n1;i++){
                list.add(sc.nextInt());
            }
            int n2=sc.nextInt();
            for (int i=0;i<n2;i++){
                int elements=sc.nextInt();
                if (!list.contains(elements))
                list.add(elements);
            }
            Collections.sort(list);
//            System.out.println(list);
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
        }*/
    }
}
