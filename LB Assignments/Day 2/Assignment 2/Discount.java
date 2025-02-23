public class Discount {
    public static void main(String[] args) {
        double totalPurchase = 1200.0;  
        String membershipStatus = "yes";
        double discount = 0.0;
        if (totalPurchase >= 1000) {
            discount = 0.20;
        } else if (totalPurchase >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }
        if (membershipStatus.equalsIgnoreCase("yes")) {
            discount += 0.05;
        }
        double discountAmount = totalPurchase * discount;
        double finalPrice = totalPurchase - discountAmount;
        System.out.println("Original Price: Rs." + totalPurchase);
        System.out.println("Discount Applied: Rs." + discountAmount);
        System.out.println("Final Price: Rs." + finalPrice);
    }
}

