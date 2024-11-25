import java.util.*;
public class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*
        Arrays syntax:
              dataTypes[] variable_name = new dataType[size];
              store 5 roll no. :
              int[] roll_no = new int[5];
              or
              int[] roll_no = {23,34,56,12,36};

              >> collection of similar dataTypes << 
        */
        // int[] marks =new int[3];
        // marks[0]=98; //chemistry
        // marks[1]=78; //phy
        // marks[2]=89; //maths
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[0]);
        // System.out.println(marks);

        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

        // int marks[] = {97,96,91};
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
        

        //input
        // int size=sc.nextInt();
        // int numbers[]=new int[size];

        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }

        // int x= sc.nextInt();

        //output
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i] == x){
        //         System.out.println("x found at index: "+ i);
        //     }else{
        //         System.out.println("Not found");
        //     }
        // }



        //.....................2-D Arrays.........................................................
        // int rows= sc.nextInt();
        // int cols = sc.nextInt();

        // int[][] numbers = new int[rows][cols];
        // System.out.println(numbers[1][2]);

        //input
        //rows
        // for(int i=0;i<rows;i++){
        //     //columns
        //     for(int j=0;j<cols;j++){
        //         numbers[i][j]=sc.nextInt();
        //     }
        // }

        // int x=sc.nextInt();

        // // output
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(numbers[i][j]+"");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         //compare with x
        //         if(numbers[i][j]==x){
        //             System.out.println("x found at location (" + i+","+j+")");
        //         }
        //     }
        // }

        //>>>>>>>Kunal Kushwaha Arrays Lecture <<<<<<<<<
        // int[] arr = new int[5];
        
        // //input using for loops
        // for(int i=0;i < arr.length;i++ ){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i = 0; i <arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }
        // System.out.println(Arrays.toString(arr));

        // arrays of objects
        // String[] str = new String[4];

        // for(int i =0;i<str.length;i++){
        //     str[i] = sc.next();
        // }

        //modify
        // str[1] = "jagriti";
        // System.out.println(Arrays.toString(str));

        //PassingInFunctions
        // public static void main(String[] args) {
        //     int[] nums = {3,4,5,12};
        //     System.out.println(Arrays.toString(nums));
        //     change(nums);
        //     System.out.println(Arrays.toString(nums));

        // }
        // public static void change(int[] arr){
        //     arr[0] = 99;
        // }

        //>>>>> MultiDimensional <<<<<<<<<<

        // int[] [] arr = new int[3][];

        // int[] [] arr = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        // int[][] arr = new int[3][3];
        // System.out.println(arr.length);  //no of rows

        //input

        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length;col++){
        //         arr[row][col] = sc.nextInt();
        //     }
        // }

        //output

        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.println(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //output

        // for(int row = 0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // for(int[] a:arr){
        //     System.out.println(Arrays.toString(a));
        // }



        //>>>>>Column Not fixed<<<<<<<<
        // int[][] arr = {
        //     {1,2,3,4},
        //     {5,6},
        //     {7,8,9}
        // };

        // for(int row = 0;row<arr.length;row++){
        //     for(int col = 0;col<arr[row].length;col++){
        //         System.out.println(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int[] a:arr){
        //     System.out.println(Arrays.toString(a));
        // }

        // for(int row = 0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }




        //>>>>>>>>>>>>>>>Array List<<<<<<<<<<<<

        //Syntax
        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(123);
        // list.add(23);
        // list.add(34);
        // list.add(3456);
        // list.add(1232);
        // list.add(232);
        // list.add(344);
        // list.add(34565);
        // list.add(1233);
        // list.add(230);
        // list.add(349);
        // list.add(34567);


        // System.out.println(list);
        // System.out.println(list.contains(349));
        // list.set(0,99); //used to add item first index and second item
        // list.remove(2);
        // System.out.println(list);

        //input
        // for(int i = 0;i < 5;i++){
        //     list.add(sc.nextInt());
        // }

        // for(int i = 0;i<5;i++){
        //     System.out.println(list.get(i));
        // }
        // System.out.println(list);

        //>>>>>>>>Multi Array List<<<<<<<<<<<<<

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //initialisation
        // for(int i = 0;i<3;i++){
        //     list.add(new ArrayList<>());
        // }

        //add elements
        // for(int i = 0; i<3;i++){
        //     for(int j = 0;j<3;j++){
        //         list.get(i).add(sc.nextInt());
        //     }
        // }
        // System.out.println(list);







        //>>>>>>>>>>>>>Swap values in Arrays<<<<<<<<<<<<
        // public static void main(String[] args) {
        //     int[] arr = {1,3,23,9,18};
        //     swap(arr,1,3);

        //     System.out.println(Arrays.toString(arr));
        // }
        // static void swap(int[] arr, int index1,int index2){
        //     int temp = arr[index1];
        //     arr[index1] = arr[index2];
        //     arr[index2] = temp;
        // }


    }
}