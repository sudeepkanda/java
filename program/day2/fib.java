import java.util.*;
class fib{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a =0;
        int b=1;
        int temp;
        int count=2;
        System.out.print(a+" "+b);
        while(count<=n){
            temp=b;
            b=a+b;
            System.out.print(" "+b);
            a=temp;
            count++;
        }
    }
    
}