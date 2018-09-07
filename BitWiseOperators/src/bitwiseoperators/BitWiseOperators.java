
package bitwiseoperators;

public class BitWiseOperators {

    public static void main(String[] args) {
        
        int a  = 15, b = 27;
        //Binary and Operator(&)
        int and  = a&b;
        //Binary or Operator(|)
        int or = a|b;
        //Binary Xor Operator(^)
        int xor = a^b;
        //Binary One Complement Operator(~)
        int oneComplement = ~a;
        //Binary LeftShift Operator(<<)
        int leftShift = a << 2;
        //Binary RightShift Operator(>>)
        int rightShift = a >> 2;
        //Binary RightShift zero fill Operator(>>>)
        int shiftrightzero = a >>> 2;
        
        System.out.println("And Operator: " + and);
        System.out.println("or Operator: " + or);
        System.out.println("xor Operator: " + xor);
        System.out.println("oneComplement Operator: " + oneComplement);
        System.out.println("leftShift Operator: " + leftShift);
        System.out.println("RightShift Operator: " + rightShift);
        System.out.println("Shift Right Zero Operator: " + shiftrightzero);        
    }
    
}
