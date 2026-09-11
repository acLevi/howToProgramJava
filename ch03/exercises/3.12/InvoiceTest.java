public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice( "1", "Keyboard", 2, 20);
        Invoice invoice2 = new Invoice("2", "Mouse", 2, 15);
        Invoice invoice3 = new Invoice("3", "Pendrive", 0, 5);
        Invoice invoice4 = new Invoice("4", "Mousepad", 2, -2.4);

        System.out.printf("First invoice -> ID: %s - Description: %s - Quantity: %d - Price: $%.2f %n-> Total: %.2f %n%n", 
            invoice1.getId(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());
        System.out.printf("Second invoice -> ID: %s - Description: %s - Quantity: %d - Price: $%.2f %n-> Total: %.2f %n%n", 
            invoice2.getId(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());
        System.out.printf("Third invoice -> ID: %s - Description: %s - Quantity: %d - Price: $%.2f %n-> Total: %.2f %n%n", 
            invoice3.getId(), invoice3.getDescription(), invoice3.getQuantity(), invoice3.getPrice(), invoice3.getInvoiceAmount());
        System.out.printf("Fourth invoice -> ID: %s - Description: %s - Quantity: %d - Price: $%.2f %n-> Total: %.2f %n%n", 
            invoice4.getId(), invoice4.getDescription(), invoice4.getQuantity(), invoice4.getPrice(), invoice4.getInvoiceAmount());

        double totalAmount = invoice1.getInvoiceAmount() + invoice2.getInvoiceAmount() + invoice3.getInvoiceAmount() + invoice4.getInvoiceAmount();
        
        System.out.printf("Checkout total: $%.2f", totalAmount);
    }
}
