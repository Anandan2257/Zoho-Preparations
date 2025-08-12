import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Product implements Serializable{
    int ProductId;
    String name;
    double price;
    int quantity;

    Product(int ProductId, String name,double price, int quantity){
        this.ProductId = ProductId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){
        return "Product Id: " +ProductId + " Name: " + name + " Price: " + price + " Quantity: " + quantity;
    }
}


public class Q5 {
    private static String FileName = "product.json"; 
    private List<Product> products;

     public Q5() {
        products = loadProducts();
    }

    private List<Product> loadProducts(){
        File file = new File(FileName);
        if(!file.exists()){
            return new ArrayList<>();
        }

        try(ObjectInputStream ob = new ObjectInputStream(new FileInputStream(file))){
            return (List<Product>) ob.readObject();
        }catch(Exception e){
            System.out.println(e);
            return new ArrayList<>();
        }
    }

    private void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    public void addProduct(Product product){
        products.add(product);
        saveProducts();
        System.out.println("Products Added");
    }

    public void viewProdcts(){
        if(products.isEmpty()){
            System.out.println("No product Available");
        }else{
            for(Product p : products){
                System.out.println(p);
            }
        }
    }
    public void SerachProduct(int productId){
        for(Product p : products){
            if(p.ProductId == productId){
                System.out.println("Product Found " + p);
            }
        }
        System.out.println("Product id not found");
    }

    public void updateProduct(int productId, double newPrice, int newQuantity) {
        for (Product p : products) {
            if (p.ProductId == productId) {
                p.price = newPrice;
                p.quantity = newQuantity;
                saveProducts();
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(int productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.ProductId == productId) {
                iterator.remove();
                saveProducts();
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }
    public static void main(String[] args) {
        Q5 manager = new Q5();
        Scanner sc = new Scanner(System.in);

        while(true){
             System.out.println("Product Inventory Menu");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                     System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    manager.addProduct(new Product(id, name, price, qty));
                    break;
                case 2:
                    manager.viewProdcts();
                    break;
                case 3:
                    System.out.print("Product id: ");
                    manager.SerachProduct(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Product ID to update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double nPrice = sc.nextDouble();
                    System.out.print("Enter New Quantity: ");
                    int nQty = sc.nextInt();
                    manager.updateProduct(uid, nPrice, nQty);
                    break;   
                case 5:
                     System.out.print("Enter Product ID to delete: ");
                    manager.deleteProduct(sc.nextInt());
                    break;     
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
