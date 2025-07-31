import java.io.*;

class Store implements Serializable {
    int product_id;
    String product_name;
    int quantity;
    double price;

    Store(int product_id, String product_name, int quantity, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + product_name + "\n" + "Id: " + product_id + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price;
    }
}

class StoreApp {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        // Serialize
        Store store = new Store(101, "Laptop", 3, 45000.0);
        FileOutputStream fos = new FileOutputStream("product.json");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(store);
        oos.close();
        fos.close();
        System.out.println("Product serialized successfully.\n");

        // Deserialize
        FileInputStream fis = new FileInputStream("product.json");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Store deserializedStore = (Store) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Deserialized Product:");
        System.out.println(deserializedStore);  
    }
}
