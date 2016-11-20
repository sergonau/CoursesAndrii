package DZ.DZ_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        User user = new User(1001, "Serg", "Koval", "Kyiv", 10000);
        User user1 = new User(1002, "Vlad", "Shvets", "Lviv", 150);
        User user2 = new User(1003, "Oleg", "Shrike", "Vasylkiv", 1000);
        User user3 = new User(1004, "Igor", "Oreshko", "Artemivsk", 700);
        User user4 = new User(1005, "Serg", "Lipinsky", "Chernivtsi", 60);
        User user5 = new User(1006, "Denis", "Kovalchuk", "Vyshneve", 950);
        User user6 = new User(1007, "Dmytro", "Sinitsyn", "Kharkiv", 3000);
        User user7 = new User(1008, "Pasha", "Polozov", "Mariupol", 1770);
        User user8 = new User(1009, "Leonid", "Kupko", "Vinnytsa", 7890);
        User user9 = new User(1010, "Serg", "Shevchenko", "Artemivsk", 107);

        Order order = new Order(1001, 77, Currency.USD, "iPad adapret", "Electro", user8);
        Order order1 = new Order(1002, 2000, Currency.USD, "IR USB port. 200 pcs", "Electro", user6);
        Order order2 = new Order(1003, 9, Currency.USD, "USB cable", "Electro", user5);
        Order order3 = new Order(1004, 177, Currency.EURO, "Windows 10", "Soft", user1);
        Order order4 = new Order(1005, 1600, Currency.USD, "TV set", "Electro", user);
        Order order5 = new Order(1006, 77, Currency.USD, "Jacket", "Closers", user2);
        Order order6 = new Order(1007, 77, Currency.USD, "T-short", "Closers", user3);
        Order order7 = new Order(1008, 600, Currency.USD, "Macbook pro", "Electro", user4);
        Order order8 = new Order(1009, 199, Currency.EURO, "Wheel", "Automotiv", user7);
        Order order9 = new Order(1010, 77, Currency.USD, "iPhone case", "Electro", user9);
        Order order10 = new Order(1011, 50, Currency.USD, "TV set", "Electro", user);
        Order order11 = new Order(1012, 50, Currency.USD, "TV set", "Electro", user);
        Order order12 = new Order(1013, 50, Currency.USD, "TV set", "Electro", user);
        Order order13 = new Order(1014, 50, Currency.USD, "TV set", "Electro", user);


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
        orders.add(order10);
        orders.add(order11);
        orders.add(order12);
        orders.add(order13);


        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-------sort list by Order price in decrease order-----");
        System.out.println();

        for (int i = 0; i < orders.size() - 1; i++) {

            for (int j = 0; j < orders.size() - 1 - i; j++) {


                if (orders.get(j).getPrice() > orders.get(j + 1).getPrice()) {

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
        System.out.println("---sort list by Order price in increase order AND User city----");
        System.out.println();


        for (int i = 0; i < orders.size() - 1; i++) {

            for (int j = 0; j < orders.size() - 1 - i; j++) {


                if (orders.get(j).getPrice() < orders.get(j + 1).getPrice()) {

                    Collections.swap(orders, j, j+1);

                }

                if(orders.get(j).getPrice() == orders.get(j+1).getPrice() &&
                        isGreaterThen(orders.get(j).getUser().getCity(), orders.get(j+1).getUser().getCity()))
                    Collections.swap(orders, j, j+1);
            }

        }

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city");
        System.out.println();



        for (int i = 0; i < orders.size() - 1; i++) {

            for (int j = 0; j < orders.size() - 1 - i; j++) {

                if(isGreaterThen(orders.get(j).getItemName(), orders.get(j+1).getItemName()))
                    Collections.swap(orders, j, j+1);
                if(orders.get(j).getItemName().equals(orders.get(j+1).getItemName()) &&
                        isGreaterThen(orders.get(j).getShopIdentificator(), orders.get(j+1).getShopIdentificator()))
                    Collections.swap(orders, j, j+1);
                if(orders.get(j).getItemName().equals(orders.get(j+1).getItemName()) &&
                        orders.get(j).getShopIdentificator().equals(orders.get(j+1).getShopIdentificator()) &&
                        isGreaterThen(orders.get(j).getUser().getCity(), orders.get(j+1).getUser().getCity()))
                    Collections.swap(orders, j, j+1);

            }

        }

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("delete duplicates from the list");
        System.out.println();

        for (int i = 0; i < orders.size() - 1; i++) {

            for (int j = 0; j < orders.size() - 1 - i; j++) {


                if(orders.get(j).getPrice() == orders.get(j+1).getPrice() &&
                        orders.get(j).getItemName().equals(orders.get(j+1).getItemName()) &&
                        orders.get(j).getShopIdentificator().equals(orders.get(j+1).getShopIdentificator()) &&
                        orders.get(j).getUser().getCity().equals(orders.get(j+1).getUser().getCity()))
                    orders.remove(j+1);


            }

        }

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("delete items where price less than 1500");
        System.out.println();

            for (int j = 0; j < orders.size(); j++) {


                if(orders.get(j).getPrice() < 1500)
                    orders.remove(j);

            }

        for (int i = 0; i < orders.size(); i++) {

            System.out.println(orders.get(i));
        }





    }


    public static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }


}