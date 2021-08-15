import java.util.Scanner;
public class ExpensesManager {
    double[] expenses;
    ExpensesManager(){
        expenses = new double[7];
    }
    double saveExpense(double moneyBeforeSalary, double expense,int day) {

        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Saved successfully! Your current balance in rubbles is: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("Your balance is low. It's time to economy...");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Day " + (i + 1) + ". Spent " + expenses[i] + " rubbles");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;

    }
}