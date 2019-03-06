package Algorithm_Training.华为机试;


///*
//题目描述
//有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
//
// 
//
//    /**
//     * 统计出兔子总数。
//     * 
//     * @param monthCount 第几个月
//     * @return 兔子总数
//     */
//public static int getTotalCount(int monthCount)
//        {
//        return 0;
//        }
//
//
//
//
//
//        输入描述:
//        输入int型表示month
//
//        输出描述:
//        输出兔子总数int型
//
//        示例1
//        输入
//        复制
//        9
//        输出
//        复制
//        34
// */
import java.util.*;
public class 统计每个月兔子的总数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int monthCount = in.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
        in.close();
    }

    public static int getTotalCount(int monthCount){
        if(monthCount==1 || monthCount==2){
            return 1;
        }

        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
}
