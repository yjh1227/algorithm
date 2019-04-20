
import java.util.*;
public class a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[][]r = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}
        };

        int n = sc.nextInt();
        sb.append(r[3][n/1000%10]);
        sb.append(r[2][n/100%10]);
        sb.append(r[1][n/10%10]);
        sb.append(r[0][n%10]);
        System.out.println(sb);


    }
}
