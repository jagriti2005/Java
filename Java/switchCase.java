import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();

        // switch(fruit){
        //     case "Mango":
        //         System.out.println("king of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("A small fruit");
        //         break;
        //     default:
        //         System.out.println("plese enter valid fruit");
        // }



        // int day = sc.nextInt();

        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thurshday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("please enter valid day");
        // }

        // int day = sc.nextInt();
        // switch(day){
        //     case 1,2,3,4,5 -> System.out.println("weekdays");
        //     case 6,7 -> System.out.println("weekend");
        //     default -> System.out.println("pls enter valid day");
        // }

        //>>>>>>>>> NestedSwitch Case <<<<<<<<<<<<<<<<

        int empId = sc.nextInt();
        String department = sc.next();

        switch(empId){
            case 1 -> System.out.println("Jagriti rai");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 ->{
                System.out.println("Emp Number 3");
                switch(department){
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
