import java.util.ArrayList;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: ₹" + price + ", Quantity: " + quantity);
    }
}

class Store {
    static String storeName;
    static String storeLocation;
    ArrayList<Product> productList = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName + ", Location: " + storeLocation);
    }

    void addProduct(Product p) {
        productList.add(p);
    }

    void displayAllProducts() {
        System.out.println("All Products:");
        for (Product p : productList) {
            p.displayProduct();
        }
    }

    public static void main(String[] args) {
        Store.setStoreDetails("Wegic Mart", "Chennai");

        Store myStore = new Store();

        Product p1 = new Product(1, "Pen", 10.0, 100);
        Product p2 = new Product(2, "Notebook", 50.0, 200);
        Product p3 = new Product(3, "Pencil", 5.0, 500);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);

        Store.displayStoreDetails();
        myStore.displayAllProducts();
    }
}
