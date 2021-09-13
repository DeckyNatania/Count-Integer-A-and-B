public class Store {
  // instance fields
  String productType;
  int productNumbers;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }

  public Store(int prodNumbers){
    productNumbers = prodNumbers;
  }
  
  // main method
  public static void main(String[] args) {
    
    Store drinkStand = new Store("lemonade");
    System.out.println (drinkStand.productType);

    Store countProducts = new Store(5);
    System.out.println (countProducts.productNumbers);
  }
}