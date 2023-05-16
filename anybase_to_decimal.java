import java.util.*;
public class anybase_to_decimal {

    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(anybase_todecimal(n, b));
    }

    public static int anybase_todecimal(int a,int b){

        int rv=0;
        int p=1;
        while(a>0){
         int d=a%10;
         a=a/10;
         rv+=d*p;
         p=p*b; }
         return rv;
    }

}

