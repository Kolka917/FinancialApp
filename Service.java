import java.util.Scanner;

public class Service {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have now?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("How much days does it left till the salary?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Your balance is: " + moneyBeforeSalary + " RUB");
                System.out.println("Which currency are you going to convert to? Available currencies: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("At which day do you want to enter the spending?: 1-Mon, 2-Tue, 3-Wed, 4-Thu, 5-Fri, 6-Sat, 7-Sun?");
                int day = scanner.nextInt();
                System.out.println("Enter your spending value:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);

            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("The biggest spending on this week is " + expensesManager.findMaxExpense() + " rub.");

            } else if (command == 0) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Sorry, there is not such command!");
            }
        }
    }


    public static void printMenu() {
        System.out.println("What are you going to do? ");
        System.out.println("1 - Convert the currency");
        System.out.println("2 - To get advise");
        System.out.println("3 - Enter the spending");
        System.out.println("4 - Show the spending on this week");
        System.out.println("5 - Show the biggest spending on this week");
        System.out.println("0 - Exit");
    }
}
