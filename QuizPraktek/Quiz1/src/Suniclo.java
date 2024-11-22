public class Suniclo {
    public static void main(String[] args) throws Exception {
        // Prices of items
        double price1 = 300000.00;  // Men Oversize T-shirt Black L
        double price2 = 150000.00;  // Airismi Polkadot Kids Sock
        double price3 = 200000.00;  // Unisex Casual Cap Cream
        double price4 = 350000.00;  // Unisex Windbreaker Jacket Purple L
        double price5 = 500000.00;  // Men Heatechy Jogger Pants L
        double price6 = 800000.00;  // Women Casual Blazer Navy M
        double price7 = 1200000.00; // Women Ripped Jeans Casual Cut Navy M

        // Calculate total purchase
        double totalPurchase = price1 + price2 + price3 + price4 + price5 + price6 + price7;

        // Discount percentage based on total purchase
        double discountPercent;
        if (totalPurchase > 1000000) {
            discountPercent = 17.5;
        } else if (totalPurchase > 750000) {
            discountPercent = 15.0;
        } else if (totalPurchase > 500000) {
            discountPercent = 10.0;
        } else if (totalPurchase > 200000) {
            discountPercent = 5.0;
        } else {
            discountPercent = 0.0;
        }

        // Calculate discount and final price
        double discountAmount = totalPurchase * (discountPercent / 100);
        double finalPrice = totalPurchase - discountAmount;

        // Print receipt
        System.out.println("Welcome to Suniclo");
        System.out.println("=============================================");
        System.out.println("Purchased Items");
        System.out.println("=============================================");
        System.out.println("1. Men Oversize T-Shirt Black L");
        System.out.println("2. Airismi Polkadot Kids Sock");
        System.out.println("3. Unisex Casual Cap Cream");
        System.out.println("4. Unisex Windbreaker Jacket Purple L");
        System.out.println("5. Men Heatechy Jogger Pants L");
        System.out.println("6. Women Casual Blazer Navy M");
        System.out.println("7. Women Ripped Jeans Casual Cut Navy M");
        System.out.println("=============================================");
        System.out.printf("Total        : IDR %.1f\n", totalPurchase);
        System.out.printf("Discount     : IDR %.1f\n", discountAmount);
        System.out.printf("Grand Total  : IDR %.1f\n", finalPrice);
    }
}