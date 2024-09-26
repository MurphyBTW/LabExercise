import java.util.Scanner;

class AmountDue {
    double computeAmountDue(double price) {
        double tax = price * 0.12;
        return price + tax;
    }
    
    double computeAmountDue(double price, int quantity) {
        double total = price * quantity;
        double tax = total * 0.12;
        return total + tax;
    }
    
    double computeAmountDue(double price, int quantity, double discount) {
        double subtotal = price * quantity;  // Calculate subtotal
        double discountedTotal = subtotal - discount;  // Apply discount
        double tax = discountedTotal * 0.12;  // Apply tax after discount
        return discountedTotal + tax;  // Return total amount due
    }
}

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();
        
        System.out.println("Press any of the following then enter values separated by spaces: ");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount amount");
        
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        
        double amountDue = 0;
        
        // Handling for different types of inputs
        if (inputs.length == 1) {  // Only price is entered
            double price = Double.parseDouble(inputs[0]);
            amountDue = due.computeAmountDue(price);
        } else if (inputs.length == 2) {  // Price and quantity are entered
            double price = Double.parseDouble(inputs[0]);
            int quantity = Integer.parseInt(inputs[1]);
            amountDue = due.computeAmountDue(price, quantity);
        } else if (inputs.length == 3) {  // Price, quantity, and discount are entered
            double price = Double.parseDouble(inputs[0]);
            int quantity = Integer.parseInt(inputs[1]);
            double discount = Double.parseDouble(inputs[2]);
            amountDue = due.computeAmountDue(price, quantity, discount);
        }
        
        System.out.printf("Amount due is %.2f\n", amountDue);  // Output amount due
        sc.close();
    }
}
