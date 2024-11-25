import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // System.out.println(num);

        //TypeCasting
        // int num = (int)(56.890f);
        // System.out.println(num);

        //automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println((double)(a));
        // System.out.println(b);

        // byte a=40;
        // byte b=50;
        // byte c=100;
        // int d=a*b/c;

        // System.out.println(d);

        // byte b=50;
        // int c = (int)(b * 2);
        // System.out.println(c);
        // byte b=50;
        // b=b*2;


        // int number = 'A';
        // System.out.println(number);

        // System.out.println("नमस्ते");
        // System.out.println(3*12.45567);

        byte b=42;
        char c='a';
        short s=1024;
        int i= 500000;
        float f= 5.67f;
        double d= 45.123455;
        double result =(f*b)+(i/c)-(d-s);
        // float + int - double = double
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);
    }
}
