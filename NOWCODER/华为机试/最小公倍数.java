import java.util.Scanner;

public class Minimum_commom_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        int max=Math.max(A,B);
        int i=1;
        while(i>0){
            int Mcm;
            Mcm=max*i;
            if (Mcm%A==0&&Mcm%B==0){
                System.out.println(Mcm);
                break;
            }
            i++;
        }
    }
}
