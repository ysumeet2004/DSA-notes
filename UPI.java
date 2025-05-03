package ECC_COdes;


abstract class UPIPayment {

    // Template method - controls the full flow
    public final void makePayment(double amount, String toUPIID) {
        validateReceiver(toUPIID);
        authenticateUser();
        pay(amount, toUPIID);  // Abstract - defined by child classes
        sendNotification(toUPIID);
        generateReceipt();
    }

    // Common behavior for all UPI apps
    private void validateReceiver(String upiId) {
        System.out.println("Checking if receiver " + upiId + " is a valid UPI ID...");
        // Simulate validation logic
    }

    private void authenticateUser() {
        System.out.println("Authenticating user using fingerprint/MPIN...");
        // Simulate authentication
    }

    private void sendNotification(String to) {
        System.out.println("Sending payment notification to " + to + "...");
    }

    private void generateReceipt() {
        System.out.println("Receipt generated successfully.\n");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void pay(double amount, String toUPIID);
}

public class UPI {
    public static void main(String[] args) {

    }
}
