import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=4,m=5;
        // //outer loops
        // for(int i=1;i<=n;i++){
            
        // //inner loops
        // for(int j=1;j<=m;j++){
        //     System.out.print("*");
        // }
        //     System.out.println();
            
        // }

        // .........Solid Rectangle..........
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // ..........Hollow Rectangle...........
        // int n=4,m=5;
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1||j==1||i==n||j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ........Half Pyramid.........
        // int n=4,m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //...........Inverted Half Pyramid.............
        // int n=4;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //.....Inverted Half Pyramid........
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     //for space
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //for star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //......Half Pyramid with Numbers.......
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //.......Inverted half pyramid with numbers........
        // int n=5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //.......Floyd's triangle......
        // int n=5;
        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //......0-1 Triangle....
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             int sum=i+j;
    //             if(sum % 2==0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }

    //.....................................Advanced Patterns........................................
    //.........Butterfly Patterns...........
    // int n=5;
    //upper half
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int spaces=2*(n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // //lower half
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int spaces=2*(n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //...........Solid Rhombus...........
    // int n=5;
    // for(int i=1;i<=n;i++){
        //spaces
        // for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        // }
        //stars
    //     for(int j=1;j<=5;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //.........Number Pyramid.........
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
        //numbers
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    //..........Palindromic Pattern........
    // int n=5;
    // for(int i=1;i<=n;i++){
        //spaces
        // for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        // }
        //1st-half numbers
        // for(int j=i;j>=1;j--){
        //     System.out.print(j);
        // }

        //2nd-half numbers
    //     for(int j=2;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    //..........Diamond Pattern.........
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int j=i;j>=1;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=4;i>=1;i--){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int j=i;j>=1;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    }
}
