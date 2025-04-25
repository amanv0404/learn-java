//10. Inventory System (Object Arrays + Methods)
//Create a `Product` class with `id`, `name`, and `price`. Create an array of products in a `Store` class.
//Write methods to:
// - Display all products
//- Find product with highest price
//- Search product by name

package javaOopsConcept;

import java.util.ArrayList;

class  Store{
    private  ArrayList<Product>  products;

    Store(){
        products = new ArrayList<>();
    }

    void addProduct(Product product){
        products.add(product);
    }

    void displayAllProduct(){
        for(Product product : products){
            product.productDetail();
        }
    }

    void productWithHighestPrice(){
        float price = 0;
        Product product = null;
        for(Product prod : products){
            if(prod.getPrice() > price){
                price = prod.getPrice();
                product = prod;
            }
        }

        if(product != null){
            System.out.println("Product with Higest Price");
            product.productDetail();
        }

    }


    void searchByName(String productName){
        boolean getProduct = false;
        for(Product product : products){
            if(product.getName() == productName){
                getProduct = true;
                System.out.println("Product Found");
                product.productDetail();

            }
        }
        if(!getProduct){
            System.out.println("There is no product with this name");
        }

    }

}

class Product{
     private int id;
     private String name;
     private float price;
     static ArrayList<Product>  products;


     Product(int id,String name,float price){
         this.id = id;
         this.name = name;
         this.price = price;
         products = new ArrayList<>();
     }


    void productDetail(){
        System.out.println("Product Id: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("-------------------------");
    }


     float getPrice(){
         return price;
     }
     String getName(){
         return  name;
     }
}


public class Question10 {


    public static void main(String[] args) {


        Product p1 = new Product(1, "Face Wash", 450);
        Product p2 = new Product(2, "Bottle", 200);
        Product p3 = new Product(3, "Shoes", 1800);
        Product p4 = new Product(4, "Watch", 2000);
        Product p5 = new Product(5, "Headphone", 3000);

        Store store1 = new Store();

        store1.addProduct(p1);
        store1.addProduct(p2);
        store1.addProduct(p3);
        store1.addProduct(p4);
        store1.addProduct(p5);


        store1.displayAllProduct();
        store1.searchByName("Face Wash");
        store1.productWithHighestPrice();

    }
}






