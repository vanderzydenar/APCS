import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String item;
    double price = 0;
    double deliveryPrice = 0;
    double orderTotal = 0;

    System.out.println("Enter the item:");

    item = scan.nextLine();

    System.out.println("Enter the Price:");

    price = scan.nextInt();

    if(price < 10){
        deliveryPrice = 2;
    } else if( price > 10){
        deliveryPrice = 0;
    }

    orderTotal = deliveryPrice + price;

    System.out.println("Invoice:");
    System.out.println(item + "    " + price);
    System.out.println("delivery     "+deliveryPrice);
    System.out.println("total     "+orderTotal);


        
  }
  }