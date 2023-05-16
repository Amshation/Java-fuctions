import java.util.*;
public class anybase_to_anybase {
    
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=10;
        int b1=sc.nextInt();
        int b2=sc.nextInt();

        int B1=anybasetoanybase(n, b1,b);
System.out.println("converting given base number into given base 1 : "+ B1);
       
int D=anybasetoanybase (B1,b,b1);
System.out.println("converting base 1 to decimal :"+ D);

int B2=anybasetoanybase(D,b2,b);
System.out.println("Converting D into base 2 :" +B2); 

    }

public static int anybasetoanybase (int n ,int b,int div ){

    int rv=0,p=1;

    while(n > 0){
        int d = n % b;
        n = n / b;
        rv += p * d;
        p = p * div;
    }
return rv;
}





}
