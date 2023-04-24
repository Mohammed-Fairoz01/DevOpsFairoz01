// Create a mini project in Java that models a simple online shopping system. The system should allow users to view products, add them to a shopping cart, and check out. The project should utilize inheritance, interfaces, overriding, collections, and custom exceptions.

 

// Here are the basic requirements:

 

// Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
// Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
// Create a class called "ShoppingCart" that stores the products selected by the user.
// Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
// Use custom exceptions to handle cases such as insufficient stock or invalid payment information.
// Implement additional features such as search,

import java.util.*;

import javax.naming.InsufficientResourcesException;
interface Product{
  String getName();
  String getDescription();
  double getPrice();
  int getQuantity();
}
class ElectronicProduct implements Product{
  private String brand,warranty,name,discription;
  private double price;
  private int quantity;
  ArrayList<ElectronicProduct> product = new ArrayList<>();
  ElectronicProduct(String brand, String warranty){
    this.brand = brand;
    this.warranty = warranty;
    
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getWarranty() {
	return warranty;
}
public void setWarranty(String warranty) {
	this.warranty = warranty;
}
}
class ClothingProduct implements Product{
  private String name,discription;
  private double price;
  private int quantity;
  private String colour;
  private double size;
  ClothingProduct(String colour, double size){
    this.colour = colour;
    this.size = size; 
  }
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
}
class ShoppingCart{
  void insert(ArrayList<Product> product){
    Scanner sc = new Scanner(System.in);
    System.out.println("Select the product you wish add");
    String select = sc.next();
    for (Product sct : product) {
      if(sct.getName().equals(select)){
        System.out.println("How many "+select+" required");
        int n = sc.nextInt();
        
          
            //if(sct.getQuantity()<n){
            try{  
              if(sct.getQuantity()<n){
              }
          }
        catch (Exception e) {
      System.out.println("Something went wrong.");
    }
        a.add(sct);
        System.out.println(select+"Succesfully added to cart");
      }else{
        System.out.println("Product not found");
      }
}
    }
  }
class CheckOut{
  
}
class Search{
  void search(ArrayList<ShoppingCart> product){
    System.out.println("enter the product name you want to search");
    String srch = sc.next();
    for(ShoppingCart p : product){
      if(p.getName().equals(srch)){
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getDescription());
        System.out.println(p.getQuantity());
      }
      else{
        System.out.println("Sorry Product not available");
      }
    }
  }
}
class OnlineShopping{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  //  ArrayList<Product> product = new ArrayList<>();
    boolean exit = false;
    
 //   int choice = sc.nextInt();
    while(!exit){
      System.out.println("1 for adding Electronics product");
      System.out.println("2 for adding Clothing Product");
      System.out.println("3 for Selection of product");
      System.out.println("4 for search for the product");
            System.out.println("5 for exit");
    int choice = sc.nextInt();
      switch(choice){
        case 1:
          ElectronicProduct product = new ElectronicProduct();
          System.out.println("Enter the name, brand,warranty,discription of the product");
          String name =  sc.next();
          String brand =  sc.next();
          String warranty =  sc.next();
          String discription =  sc.next();
          System.out.println("Enter the price of the product");
          double price = sc.nextDouble();
          System.out.println("Enter how much quantity u want");
          int quantity = sc.nextInt();
          System.out.println("Enter the colour of the product");
          String colour =  sc.next();
      }
    }
    
  }
}