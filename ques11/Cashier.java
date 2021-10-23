package com.knoldus.kup.Core_Java.ques11;

import com.knoldus.kup.Core_Java.Printer;
//We have defined a class as Printer and a static method print() inside the class to print.
import java.util.*;

public class Cashier {
    int EmpId;
    String name;
    public void placeOrderToQueue(Order order){
    }
    public static void serveCoffee(Order order){
        Customer.collectCoffee("Your Coffee is ready "+order.coffeeType+",Enjoy your coffee");
    }
    static int takeOrder() {
        int choice = 0;
        int cost =0;
        int token_no;
        Scanner sc=new Scanner(System.in);
        ArrayList<Order> orders =new ArrayList<>();
        ArrayList<Coffee> coffees =new ArrayList<>();

//      adding some coffees by using Coffee class object and adding to the coffees ArrayList
        coffees.add(new Coffee(1,"CARAMEL MACCHIATO",50));
        coffees.add(new Coffee(2,"CAFÉ MOCHA",60));
        coffees.add(new Coffee(3,"AMERICANO",80));
        coffees.add(new Coffee(4,"TURKISH COFFEE",30));
        coffees.add(new Coffee(5,"Hazelnut",90));
        char wantToExit;
//        here we are showing menu to the user
        do {
            try {
                System.out.println("\n================= Coffee Shop =================" +
                        "\n*********** Please select an Order *********** " +
                        "\nPress 1: For CARAMEL MACCHIATO \t----------->\t50 Rs" +
                        "\npress 2: For CAFÉ MOCHA \t    ----------->\t60 Rs" +
                        "\npress 3: For AMERICANO \t        ----------->\t80 Rs" +
                        "\nPress 4: For TURKISH COFFEE \t----------->\t30 Rs" +
                        "\nPress 5: For Hazelnut \t        ----------->\t90 Rs" +
                        "\nPress 6: For Exit");
                System.out.println("Enter your choice :");
                choice = sc.nextInt();
                if(choice == 6){
                    Printer.print("Thanks for using our service");
                    System.exit(0);
                }
                System.out.println("Please pay the cost of Order " + choice);
                cost = sc.nextInt();

            } catch (Exception e) {
                System.out.println("exception is: " + e);
            }
//            generating random token number
            Random random = new Random();
            try {
                for (int i = 0; i < coffees.size(); i++) {
                    if (coffees.get(i).id == choice && coffees.get(i).cost == cost) {
                        Coffee coffee = coffees.get(i);
                        int tokenNo = random.nextInt(1000);
                        Order order1 = new Order(coffee.id, coffee.name, tokenNo);
                        orders.add(order1);
                        System.out.println("You have paid Rs." + cost + " for Your Order: " + coffee.name + "\n" +
                                "Your token no : " + tokenNo);
                        Barista.prepareCoffee(order1);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("\n\nDo you want to continue(y/n)");
            wantToExit = sc.next().charAt(0);
        }
        while (wantToExit == 'Y' || wantToExit == 'y') ;
        return 0;
    }
}
