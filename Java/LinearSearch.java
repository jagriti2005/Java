import java.util.*;
public class LinearSearch{
    // public static void main(String[] args) {
    //     int[] nums = {12,23,45,67,-2,3,19,57};
    //     int target = 19;
    //     int ans = linearSearch(nums,target);
    //     System.out.println(ans);
    // }


    // search in the array: return the index if item found 
    // otherwise if item not found return -1

    // static int linearSearch(int[] arr,int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

        // run a for loop
        // for(int index = 0; index < arr.length; index++){
        //     // check for element at every index if it is = target
        //     int element = arr[index];
        //     if(element == target){
        //         return index;
        //     }
        // }

        // this line will execute if none of the return statement is true
        // hence the target not found
        // return -1;

    // }

        //>>>>>>>Return element<<<<<<<<<<<<< 
        // static int linearSearch2(int[] arr,int target){
        //     if(arr.length == 0){
        //         return -1;
        //     }

        //     for(int index = 0; index < arr.length; index++){
        //         int element = arr[index];
        //         if(element == target){
        //             return element;
        //         }
        //     }
        //     return -1;

        // }


        // >>>>>>>>>>>QUESTION<<<<<<<<<<<<<<<<<

        //  >>>>>>>>>>>> SearchInStrings <<<<<<<<<<<

    // public static void main(String[] args) {
    //     String name = "Kunal";
    //     char target = 'u';
    //     // System.out.println(search(name,target));
    //     System.out.println(Arrays.toString(name.toCharArray()));
    // }

    // static boolean search(String str , char target ){
    //     if(str.length() == 0){
    //         return false;
    //     }

    //     for(char ch : str.toCharArray()){
    //         if(ch == target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // static boolean search(String str , char target ){
    //     if(str.length() == 0){
    //         return false;
    //     }

    //     for(int i = 0; i < str.length(); i++){
    //         if(target == str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }




    //>>>>>>>>>>>SearchInRange<<<<<<<<<<<<<<<<<

    // public static void main(String[] args) {
    //     int[] arr = {18,12,-7,3,14,28};
    //     int target = 14;
    //     System.out.println(linearSearch(arr,target,1,4));
    // }

    // static int linearSearch(int[] arr,int target,int start,int end){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     for(int index = start;index <= end; index++){
    //         int element = arr[index];
    //         if(element == target){
    //             return index;
    //         }
    //     }
    //     return -1;
    // }





    // >>>>>>>>>>>>>> FindMinimun <<<<<<<<<<<<<<<<<<<
    // public static void main(String[] args) {
    //     int[] arr = {18,12,-7,3,14,28};
    //     System.out.println(min(arr));
    // }

    // static int min(int[] arr){
    //     int ans = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] < ans){
    //             ans = arr[i];
    //         }
    //     }
    //     return ans;
    // }






    // >>>>>>>>>>>>>> SearchIn2DArray <<<<<<<<<<<<<<<<<<
    // public static void main(String[] args) {
    //     int[][] arr = {
    //         {23,4,1},
    //         {18,12,3,9},
    //         {78,99,34,56},
    //         {18,12}
    //     };
    //     int target = 56;
    //     int[] ans = search(arr,target);
    //     System.out.println(Arrays.toString(ans));
    // }

    // static int[] search(int[][] arr,int target){
    //     for(int row = 0; row < arr.length; row++){
    //         for(int col = 0; col < arr[row].length; col++){
    //             if(arr[row][col] == target){
    //                 return new int[]{row,col};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
}