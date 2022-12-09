import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Ana kümenin eleman sayısını giriniz:");
        int n= input.nextInt();

        System.out.print("Alt kümenin eleman sayısını giriniz:");
        int r= input.nextInt();

        int top1=1;
        int i=1;
        while(i<=n){
            top1*=i;
            i++;
        }

        int top2=1;
        int j=1;
        while(j<=r){
            top2*=j;
            j++;
        }

        int top3=1;
        int k=1;
        while(k<=(n-r)){
            top3*=k;
            k++;
        }

        System.out.print("C(n,r):"+top1/(top2*top3));



    }
}
