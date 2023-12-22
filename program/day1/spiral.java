import java.util.*;
public class spiral{
    public static void main(String args[]){
        int [][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int rowStart=0;
        int colStart=0;
        int rowEnd=arr.length-1;
        int colEnd=arr[0].length-1;
        //print arr
        for(int i=0;i<arr.length;i++){
            System.out.print("[ ");
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ]");
        }
       
        //System.out.print(rowStart+" "+rowEnd+" "+colStart+" "+colEnd);
        while(rowStart<=rowEnd&&colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(arr[rowStart][col]+" ");
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(arr[row][colEnd]+" ");
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--){
                System.out.println(arr[rowEnd][col]+" ");
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.println(arr[row][colStart]+" ");
            }
            colStart++;
            System.out.println(rowStart+" "+rowEnd+" "+colStart+" "+colEnd);
            //break;
        }
        
    }
}