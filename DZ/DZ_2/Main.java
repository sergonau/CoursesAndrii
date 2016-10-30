package DZ.DZ_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        User user = new User(1001, "Serg", "Koval", "Kyiv", 100);
        User user1 = new User(1002, "Vlad", "Shvets", "Lviv", 150);
        User user2 = new User(1003, "Oleg", "Shrike", "Odesa", 1000);
        User user3 = new User(1004, "Igor", "Oreshko", "Kherson", 700);
        User user4 = new User(1005, "Serg", "Lipinsky", "Chernivtsi", 60);
        User user5 = new User(1006, "Denis", "Kovalchuk", "Vyshneve", 950);
        User user6 = new User(1007, "Dmytro", "Sinitsyn", "Kharkiv", 3000);
        User user7 = new User(1008, "Pasha", "Polozov", "Mariupol", 1770);
        User user8 = new User(1009, "Leonid", "Kupko", "Vinnytsa", 7890);
        User user9 = new User(1010, "Serg", "Shevchenko", "Kyiv", 107);

        Order order = new Order(1001, 77, Currency.USD, "iPad adapret", "Electro", user8);
        Order order1 = new Order(1002, 27, Currency.USD, "IR USB port", "Electro", user6);
        Order order2 = new Order(1003, 9, Currency.USD, "USB cable", "Electro", user5);
        Order order3 = new Order(1004, 177, Currency.USD, "Windows 10", "Soft", user1);
        Order order4 = new Order(1005, 50, Currency.USD, "TV set", "Electro", user);
        Order order5 = new Order(1006, 77, Currency.USD, "Jacket", "Closers", user2);
        Order order6 = new Order(1007, 120, Currency.USD, "T-short", "Closers", user3);
        Order order7 = new Order(1008, 600, Currency.USD, "Macbook pro", "Electro", user4);
        Order order8 = new Order(1009, 199, Currency.USD, "Wheel", "Automotiv", user7);
        Order order9 = new Order(1010, 30, Currency.USD, "iPhone case", "Electro", user9);

        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < orders.size() - 1; i++) {

            for (int j = 0; j < orders.size() - 1 - i; j++) {


                if (orders.get(j).getPrice() < orders.get(j + 1).getPrice()) {

                    Collections.swap(orders, j, j+1);

                }
            }

        }

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }


        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");


    }

}