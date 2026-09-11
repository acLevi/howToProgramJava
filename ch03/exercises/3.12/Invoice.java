// Exercise 3.12: Create a class called Invoice for a computer supply store to use to represent an invoice for an item sold.
// An Invoice must include four pieces of information as instance variables: the number, the description, the quantity purchased, and the price per item.
// Your class must have a constructor that initializes the four instance variables.
// Additionally, provide a method called getInvoiceAmount that calculates the invoice amount.
// If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
// Write a test application called InvoiceTest that demonstrates the capabilities of the Invoice class.

public class Invoice {
    private String id;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String id, String description, int quantity, double price) {
        this.setId(id);

        this.setDescription(description);

        this.setQuantity(quantity);

        this.setPrice(price);
    }

    public double getInvoiceAmount() {
        double amount = price * quantity;

        return amount;
    }

    // get methods
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // set methods
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) this.quantity = 0;
        else this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0.0) this.price = 0.0;
        else this.price = price;
    }
}
