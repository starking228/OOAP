package Lab8;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DateInterpreterDemo {
    public static void main(String[] args) {
        DateInterpreterContext context = new DateInterpreterContext();

//        while (true) {
//           try {
//               Scanner scanner = new Scanner(System.in);
//               System.out.println("""
//                           Choose format of date
//                           1. MM-DD-YYYY
//                           2. DD-MM-YYYY
//                           3. YYYY-MM-DD
//                           4. Exit
//                       """);
//               int choice = getChoice(5);
//               switch (choice) {
//                   case 1 -> {
//                       System.out.println("Input date");
//                       String date = scanner.nextLine();
//                       System.out.println(context.interpret("MM-DD-YYYY", date));
//                   }
//                   case 2 -> {
//                       System.out.println("Input date");
//                       String date = scanner.nextLine();
//                       System.out.println(context.interpret("DD-MM-YYYY", date));
//                   }
//                   case 3 -> {
//                       System.out.println("Input date");
//                       String date = scanner.nextLine();
//                       System.out.println(context.interpret("YYYY-MM-DD", date));
//                   }
//                   case 4 -> {
//                       System.exit(0);
//                   }
//               }
//           }catch (Exception e) {
//               System.out.println("Invalid date");
//           }
//        }

        // Приклади введених дат
        String date1 = "03-21-2025"; // MM-DD-YYYY
        String date2 = "21-03-2025"; // DD-MM-YYYY
        String date3 = "2025-03-21"; // YYYY-MM-DD

        System.out.println("MM-DD-YYYY -> " + context.interpret("MM-DD-YYYY", date1));
        System.out.println("DD-MM-YYYY -> " + context.interpret("DD-MM-YYYY", date2));
        System.out.println("YYYY-MM-DD -> " + context.interpret("YYYY-MM-DD", date3));
    }

    private static int getChoice(int length) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, choose option");
            int choice = scanner.nextInt();
            if (choice < 1 || choice >  length) {
                System.out.println("Invalid number of option");
                return getChoice(length);
            }
            else return choice;
        } catch (Exception e) {
            System.out.println("Only numbers!");
            return getChoice(length);
        }
    }
}
