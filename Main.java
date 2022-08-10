import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        int[][] a =new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==1){
                    a[i][n+1-j]=count++;
                }else{
                    a[i][j]=count++;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }
}
