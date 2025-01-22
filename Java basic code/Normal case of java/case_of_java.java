//Write a java code where all java case are avaiable.


package com.example;
import java.util.*;
public class case_of_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Lower Case");
        System.out.println("2. Upper Case");
        System.out.println("3. Title Case");
        System.out.println("4. Camel Case");
        System.out.println("5. Pascal Case");
        System.out.println("6. Snake Case");
        System.out.println("7. Kebab Case");
        System.out.println("8. Exit");
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter a string");
            String str = sc.next();
            System.out.println(str.toLowerCase());
            break;
                
            case 2:
            System.out.println("Enter a string");
            String str1 = sc.next();
            System.out.println(str1.toUpperCase());
            break;
                
            case 3:
            System.out.println("Enter a string");
            String str2 = sc.next();
            System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(
                1).toLowerCase());
                break;
                case 4:
                System.out.println("Enter a string");
                String str3 = sc.next();
                System.out.println(str3.substring(0, 1).toLowerCase() + str3.substring(
                    1).toUpperCase());
                    break;
                    case 5:
                    System.out.println("Enter a string");
                    String str4 = sc.next();
                    System.out.println(str4.substring(0, 1).toUpperCase() + str4.substring(
                        1).toLowerCase());
                        break;
                        case 6:
                        System.out.println("Enter a string");
                        String str5 = sc.next();
                        System.out.println(str5.replace(" ", "_"));
                        break;
                        case 7:
                        System.out.println("Enter a string");
                        String str6 = sc.next();
                        System.out.println(str6.replace(" ", "-"));
                        break;
                        case 8:
                        System.out.println("Exiting...");
                        break;
                        default:
                        System.out.println("Invalid choice");
        }
    }
}
