package programs;

import java.util.Scanner;

public class BankWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();

        // 🛡️ Guard Clause 1: Invalid balance
        if (balance <= 0) {
            System.out.println("Invalid account balance ❌");
            return;
        }

        // 🛡️ Guard Clause 2: Invalid withdrawal amount
        if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount must be positive ❌");
            return;
        }

        // 🛡️ Guard Clause 3: Insufficient balance
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance ❌");
            return;
        }

        // ✅ Main business logic
        balance -= withdrawAmount;
        System.out.println("Withdrawal successful ✅");
        System.out.println("Remaining balance: " + balance);

        sc.close();
    }
}

