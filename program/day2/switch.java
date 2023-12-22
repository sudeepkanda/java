import java.util.*;
 class switc
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        switch(str){
            case "sudeep":
                System.out.print("in a sudeep world ");
                break;
                //( break;sudeep
//                in a sudeep world in a apuroop world)
            case "apuroop":
                System.out.print("in a apuroop world  ");
                break;
                //( break;apuroop
//in a apuroop world  searching )

            default:
                System.out.println("searching");
            
        }
    }
    
}