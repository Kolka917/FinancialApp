public class DinnerAdvisor {

    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Today it is better to eat at home. Save your money and you will be alive till the salary!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Ok, let's go to Macdonalds!");
            } else {
                System.out.println("Today it is better to eat at home. Save your money and you will be alive till the salary!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Not bad! Buy some dollars and go to have a dinner to a cool cafe! :)");
            } else {
                System.out.println("Ok, let's go to Macdonalds!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Perfect. It's time to order crabs!");
            } else {
                System.out.println("Not bad! Buy some dollars and go to have a dinner to a cool cafe! :)");
            }
        }
    }
}