 
public class primitive_data{
    //primitives are which cannot be divided further they are basic data types
    public static void main(String[] args){
        int a=64;
        char ch='a';
        /*main.java:6: error: incompatible types: possible lossy conversion from double to int
        int decimal=86.87;
                    ^
*/
// by default decimal number is treated as a double so we have to explicitly say "f" to convert to float
// similarly an integer is in genral a int type if we have to convert to long 
//we have to specify with "l"
//wow new thing
// eroor is pasted so that i can remember it is converting from double to int not float to int.
        float decimal=123456786.87874678f;
        System.out.println(decimal);
        double largedecimalvalues=87496867.867477779;
        System.out.println(largedecimalvalues);
        long large_integer_values=929797899776877l;
        System.out.println(large_integer_values);
        
        
        // to represent number : we generally use comma "," but java dosent accept it 
        // so replace it with " _ "
        int price=10_000_000;
        System.out.print("printing number with \"_\" #price=10_000_000 : ");
        System.out.println(price);
    }
}