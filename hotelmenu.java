import java.util.*;

public class hotelmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item, qty, rate, total;
        System.out.println("HOTEL MENU\nSelect your food:");
        System.out.println("1. Coffee \n2. Tea \n3. Veg Momos \n4. Chowmien \n5. Hakka Noodles");
        System.out.println("6. Burger \n7. Pizza \n8. Pasta");
        item = sc.nextInt();
        switch (item) {
            case 1:
                System.out.println("You have selected Coffee. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 20;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 2:
                System.out.println("You have selected Tea. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 15;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 3:
                System.out.println("You have selected Veg Momos. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 60;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 4:
                System.out.println("You have selected Chowmien. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 80;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 5:
                System.out.println("You have selected Hakka Noodles. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 90;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 6:
                System.out.println("You have selected Burger. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 60;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 7:
                System.out.println("You have selected Pizza. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 100;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            case 8:
                System.out.println("You have selected Pasta. \nEnter the quantity:");
                qty = sc.nextInt();
                rate = 90;
                total = qty * rate;
                System.out.println("Total amount: " + total);
                break;
            default:
                System.out.println("Wrong choice. Please try again!");
                break;
        }
        sc.close();
    }
}
