package Algorithm_Training;
/*


牛顿迭代法。设f(x)=x3-y, 求f(x)=0时的解x，即为y的立方根。
根据牛顿迭代思想，xn+1=xn-f(xn)/f'(xn)即x=x-(x3-y)/(3*x2)=(2*x+y/x/x)/3;
 */
import java.util.Scanner;

public class 求解立方根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y= sc.nextDouble();
        double x0=y;
        double x1=(2*x0+y/x0/x0)/3;
        while(Math.abs(x1*x1*x1-y)>0.000001){
            x0=x1;
            x1 = (2*x0+y/x0/x0)/3;
        }
        System.out.printf("%.1f",x1);
    }
}
