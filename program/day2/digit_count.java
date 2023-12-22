import java.util.*;
class upper_lower{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[10];
        int num=sc.nextInt();
        while(num>0){
            int rem=num%10;
            arr[rem]++;
            num=num/10;
        }
        System.out.println(Arrays.toString(arr));
    }
}