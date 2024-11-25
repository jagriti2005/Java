// import java.util.Scanner;
// public class functions {

    //........print name...........
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     string name=sc.next();

    //     printMyName(name);


    //............print sum of two no.............
    // public static int calculateSum(int a,int b){
    //     int sum=a+b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();

    //     int sum=calculateSum(a,b);
    //     System.out.println(sum);
    // }


    //............print product of two no..............
    // public static int calculateProduct(int a,int b){
    //     int product=a*b;
    //     return product;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();

    //     int product=calculateProduct(a,b);
    //     System.out.println("the product of two no. is:"+product);
    // }

    //..........find the factorial of the number......................
//     public static void printfactorial(int n){
//         //loop

//         if(n<0){
//             System.out.println("Invalid Number");
//             return;
//         }
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

        // printfactorial(n);
    // }
// }



import java.util.Scanner;
public class functions{
    public static String greet(String a){
        String name = a;
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String name=greet(a);
        System.out.println("String: "+ name);
    }
}