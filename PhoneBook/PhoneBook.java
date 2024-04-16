package PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static Map<String, String> phoneBook = new HashMap<>();
    public static Scanner sn = new Scanner(System.in);

    private static void displayMenu() {
        System.out.println("\nPhone Book Menu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Display Contacts");
        System.out.println("5. Exit");
    }

    private static void addContact(){
        System.out.print("Enter name: ");
        String name = sn.next();
        System.out.print("Enter phone number: ");
        String num = sn.next();
        phoneBook.put(name,num);
    }

    private static void deleteContact(){
        System.out.print("Enter name to delete: ");
        String name = sn.next();
        String removed = phoneBook.remove(name);
        if (removed != null) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void updateContact(){
        System.out.print("Enter name to update: ");
        String name = sn.next();
        if (phoneBook.containsKey(name)) {
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = sn.next();
            phoneBook.put(name, newPhoneNumber);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void display(){
        System.out.println(phoneBook.isEmpty() ? "Phone book is empty." : "Contacts in Phone Book:");
        phoneBook.forEach((name, num) -> System.out.println(phoneBook.isEmpty() ? "" : "Name: " + name + ", Phone Number: " + num));
    }


    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sn.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting from the phone book....");
                    sn.close();
                    break;
    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        
    }
}
