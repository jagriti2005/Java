import java.util.Scanner;
public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //...........Get Bit.................
    //     int n=5; //0101
    //     int pos = 3;
    //     int bitMask = 1<<pos;
        
    //     if((bitMask & n) == 0){
    //         System.out.println("bit was zero");
    //     }else{
    //         System.out.println("bit was one");
    //     }

    //..............Set Bit..................
        // int n=5; //0101
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);


        //...........Clear Bit..................
        // int n=5; //0101
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);


        //..............Update Bit...................
        int n=5; //0101
        int pos=1;
        int oper = sc.nextInt(); 

        if(oper == 1){
            //set bit
            int bitMask=1<<pos;
            int newNumber= bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear bit
            int bitMask=1<<pos;
            int notBitMask= ~(bitMask);
            int nextNumber = notBitMask & n;
            System.out.println(nextNumber);
        }
    }
}
