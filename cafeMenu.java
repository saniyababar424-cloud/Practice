public class cafeMenu {
    public static void main(String[] args) {
        int teaPrice = 3;
        int coffeePrice = 5;
        int sandwichPrice = 8;
        int burgerPrice = 10;
        int pizzaPrice = 15;
        String cafeName = "Arohi Cafe";
        String specialMenu = "Pizza";
        String offerItem = "Pizza";
        String offer = "Get 10% OFF";
        System.out.println("===========================================================");
        System.out.println("                  WELCOME TO JAVA CAFE");
        System.out.println("===========================================================");
        System.out.println();
        System.out.println("+---------------------------------------------------------+");
        System.out.println("| Item                     Price                          |");
        System.out.println("+---------------------------------------------------------+");
        System.out.println("| Tea                      $" + teaPrice + "                             |");
        System.out.println("| Coffee                   $" + coffeePrice + "                             |");
        System.out.println("| Sandwich                 $" + sandwichPrice + "                             |");
        System.out.println("| Burger                   $" + burgerPrice + "                            |");
        System.out.println("| Pizza                    $" + pizzaPrice + "                            |");
        System.out.println("+---------------------------------------------------------+");

        System.out.println("Today's Special Menu : " + specialMenu);
        System.out.println("Today's Offer : " + offer + " on " + offerItem);
        System.out.println();
        System.out.println("Thank You For Visiting " + cafeName);
    }
}