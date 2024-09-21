package controller;





import java.util.List;
import java.util.Scanner;

import bean.FoodWaste;
import dao.FoodWasteService;

public class FoodWasteController {
    public static void main(String[] args) {
        FoodWasteService service = new FoodWasteService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Food Waste");
            System.out.println("2. View All Food Wastes");
            System.out.println("3. Update Food Waste");
            System.out.println("4. Delete Food Waste");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    FoodWaste waste = new FoodWaste();
                    System.out.print("Enter food item: ");
                    waste.setFoodItem(scanner.next());
                    System.out.print("Enter quantity (kg): ");
                    waste.setQuantity(scanner.nextDouble());
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    waste.setDate(scanner.next());
                   /* try {
                    service.createFoodWaste(waste);
                    }
                    catch(Exception e)
                    {
                    	System.out.println(e);
                    } */
                    System.out.println("Food waste added successfully!");
                    break;

                case 2:
                    List<FoodWaste> wastes = service.getAllFoodWaste();
                    System.out.println("Food Waste Records:");
                    for (FoodWaste fw : wastes) {
                        System.out.println(fw.getId() + ": " + fw.getFoodItem() + ", " + fw.getQuantity() + " kg, " + fw.getDate());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID of food waste to update: ");
                    int updateId = scanner.nextInt();
                    FoodWaste updateWaste = new FoodWaste();
                    updateWaste.setId(updateId);
                    System.out.print("Enter new food item: ");
                    updateWaste.setFoodItem(scanner.next());
                    System.out.print("Enter new quantity (kg): ");
                    updateWaste.setQuantity(scanner.nextDouble());
                    System.out.print("Enter new date (YYYY-MM-DD): ");
                    updateWaste.setDate(scanner.next());
                    service.updateFoodWaste(updateWaste);
                    System.out.println("Food waste updated successfully!");
                    break;

                case 4:
                    System.out.print("Enter ID of food waste to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteFoodWaste(deleteId);
                    System.out.println("Food waste deleted successfully!");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}

/* import java.util.Scanner;

import service.FoodService;

public class FoodWasteController {
    public static void main(String[] args) {
        String foodItem = "";
        double quantity = 0;
        int ch, ch1 = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------WELCOME TO FOOD WASTE MANAGEMENT-------------------");
        FoodService foodWasteService = new FoodService();
        
        while (ch1 != 0) {
            System.out.println("1. Add Food Item");
            System.out.println("2. Report Food Waste");
            System.out.println("3. View All Donations");
            System.out.println("4. View Waste Reports");
            System.out.println("Enter your choice:");
            ch = s.nextInt();
            s.nextLine(); 
            
            switch (ch) {
                case 1:
                    System.out.println("Enter Food Item Name:");
                    foodItem = s.nextLine();
                    System.out.println("Enter Quantity (in kg):");
                    quantity = s.nextDouble();
                    int addCount = foodWasteService.addFoodItem(foodItem, quantity);
                    System.out.println(addCount + " Food Item Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter Food Item Name:");
                    foodItem = s.nextLine();
                    System.out.println("Enter Quantity Wasted (in kg):");
                    quantity = s.nextDouble();
                    foodWasteService.reportWaste(foodItem, quantity);
                    System.out.println("Food Waste Reported Successfully");
                    break;

                case 3:
                    String donations = foodWasteService.viewDonations();
                    System.out.println("---------------ALL DONATIONS---------------\n" + donations);
                    break;

                case 4:
                    String wasteReports = foodWasteService.viewWasteReports();
                    System.out.println("---------------WASTE REPORTS---------------\n" + wasteReports);
                    break;

                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            
            System.out.println("\nEnter 1 to perform More Operations and 0 for Exit:");
            ch1 = s.nextInt();
        }
        s.close();
    }
} */


