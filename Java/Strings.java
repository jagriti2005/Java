import java.util.Scanner;
public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String declaration
        String name = "tony";
        String fullName = "tony stark";
        String sentence = "My name is Tony stark.";
        System.out.println(sentence);

        //Taking Input
        // String name = sc.next();
        // String fullName = sc.nextLine();
        // System.out.println("Your name is:"+name);
        // System.out.println("Your full name is:"+fullName);


        //concatenation
        // String firstName = "tony";
        // String secondName = "stark";
        // String fullName = firstName + secondName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        //charAt
        // for(int i=0; i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //compare two strings
        // String name1 = "tony";
        // String name2 = "stark";
        // if(name1.compareTo(name2)==0){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        //substring
        // String sentence="Tony Stark";
        // String name=sentence.substring(1,7);
        // System.out.println(name);

        //Strings are immutable
        //substring(first index,end index)

        //............String Builder................
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // //insert a character at some index
        // sb.insert(0,'S');
        // System.out.println(sb);

        // //delete char at some index
        // sb.delete(0,1);
        // System.out.println(sb);

        // //append a char
        // sb.append("stark");
        // System.out.println(sb);


        StringBuilder sb = new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}