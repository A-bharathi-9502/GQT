package Ecommerce;
import java.util.*;
class Cart {
private Product[] items = new Product[200];
private int count = 0;
public void addProduct(Product p) {
	items[count++] = p;
	System.out.println(Colors.GREEN+"✔ Product added to cart"+Colors.RESET);
	}
public void showBill() {
    double total = 0;
    double gstRate = 0.18;       // 18% GST
    double discountRate = 0.10;  // 10% Discount
    double gstAmount, discountAmount = 0, finalAmount;

    System.out.println(Colors.GREEN + "\n==================== BILL RECEIPT ====================" + Colors.RESET);

    // Header
    System.out.printf(
        Colors.GREEN + "%-5s %-15s %-30s %-10s\n" + Colors.RESET,
        "S.No", "Category", "Item", "Price(Rs)"
    );
    System.out.println(Colors.GREEN + "------------------------------------------------------" + Colors.RESET);

    // Items
    for (int i = 0; i < count; i++) {
        Product p = items[i];

        System.out.printf(
            p.getColor() + "%-5d %-15s %-30s %-10.2f\n" + Colors.RESET,
            (i + 1),
            p.getCategory(),
            p.getName(),
            p.getPrice()
        );

        total += p.getPrice();
    }

    System.out.println(Colors.GREEN + "------------------------------------------------------" + Colors.RESET);

    // GST Calculation
    gstAmount = total * gstRate;

    // Discount Condition
    if (total >= 5000) {
        discountAmount = total * discountRate;
    }

    finalAmount = total + gstAmount - discountAmount;

    // Summary
    System.out.printf(Colors.GREEN + "%-50s %-10.2f\n", "Subtotal :", total);
    System.out.printf("%-50s %-10.2f\n", "GST (18%) :", gstAmount);
    System.out.printf("%-50s %-10.2f\n", "Discount :", discountAmount);
    System.out.println("------------------------------------------------------");
    System.out.printf("%-50s %-10.2f\n", "FINAL AMOUNT :", finalAmount);
    System.out.println("======================================================" + Colors.RESET);
}

public boolean isEmpty() {
	return count == 0;
	}
}