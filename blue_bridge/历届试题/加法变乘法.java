package Test;


public class 加法变乘法 {
    public static void main(String[] args) {
        int[] arr=new int[49];
        for (int i = 0; i < 49; i++) {
            arr[i]=i+1;
        }

        for (int i=0;i<49;i++){
            for (int j=i+2;j<49-2;j++){
                f(i,j);
            }
        }
    }

    private static void f(int i, int j) {
        if (i*(i+1)+j*(j+1)-(i+i+1+j+j+1)==790){
            System.out.println(i+" "+j);
        }
    }
}
