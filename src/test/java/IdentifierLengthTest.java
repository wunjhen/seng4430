public class IdentifierLengthTest {

    // Very short identifiers
    int a = 10;
    double b = 20.5;
    String c = "Hello";

    // Appropriately lengthed identifiers
    int itemCount = 5;
    double totalPrice = 150.75;
    String userName = "JohnDoe";

    // Excessively long identifiers
    int numberOfItemsInShoppingCartByCurrentUser = 3;
    double totalPriceOfAllItemsPurchasedInLastTransactionByUser = 299.99;
    String descriptiveUserNameBasedOnSignUpInformation = "JaneSmith2024";

    public void calculateTotal() {
        // Using short identifiers
        double sum = a * b;
        System.out.println("Total: " + sum);

        // Using appropriately lengthed identifiers
        double finalPrice = itemCount * totalPrice;
        System.out.println("Final Price: " + finalPrice);

        // Using excessively long identifiers
        double transactionTotal = numberOfItemsInShoppingCartByCurrentUser * totalPriceOfAllItemsPurchasedInLastTransactionByUser;
        System.out.println("Transaction Total: " + transactionTotal);
    }

    public static void main(String[] args) {
        IdentifierLengthTest test = new IdentifierLengthTest();
        test.calculateTotal();
    }
}
