// importance of functions

// 1: your code will become modular. Modularity: " means code will break into samll codes"
// 2: maintainablity : easy to update your code ,  hepl to not repet the same code  again and again.
//, easy to optimize the code .
 


// Q: how to find NPR if n and  r is given by user

// formula of npr= n(factorial)/n-r(factorial);

import java.util.*;
public class introduction{

    public static void display(int npr){ // function for display the result
        System.out.println("NPR :"+ npr);
    }

    public static int fact(int x)
    {   
         int rv=1;
        for(int i=1;i<=x;i++){           // function for finding factorial
          rv*=i;}
          return rv;
    }
public static void  main(String aregs []){

    Scanner sc=new Scanner(System.in);
System.out.println("Enter value in n");
    int n=sc.nextInt();

    System.out.println("Enter value in r");
    int r=sc.nextInt();

  /*   int nfac=1,rnfact=1;
    for(int i=1;i<=n;i++){
         nfac*=i;    }      this is the method of gatting factorial without using functions.

    for(int i=1;i<=n-r;i++){
        rnfact*=i;
        }*/

    System.out.println("n factorial"+fact(n)+" \t"+" r factorial "+fact(r));

    int npr=fact(n)/fact(n-r);
    display(npr);


}

}
