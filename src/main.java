import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Scanner object
        Scanner incomeObj = new Scanner(System.in);

        //Intro to the program
        System.out.println("Welcome to the income tax calculator!");
        System.out.println("This program will calculate the income tax that you owe, and your income after tax!");
        System.out.println("\nEnter your income: $");
        double income = incomeObj.nextDouble(); //User input

        double incomeToBeRounded = (calculate(income, 0));
        System.out.println("Your grand total after income taxes $" + (Math.round(incomeToBeRounded * 100)/100));
    }

    public static double calculate(double income, double incomeAfterTax) {
        //Calculation of deductions
        double deductions;
        if (income > 216511) {
            deductions = income * 0.33;
            System.out.println("Your total deduction from your income was $" + (Math.round(deductions * 100)/100));
            incomeAfterTax = income * 0.67;
        }
        else if (income < 216511 && income > 151978) {
            deductions = income * 0.29;
            System.out.println("Your total deduction from your income was $" + (Math.round(deductions * 100)/100));
            incomeAfterTax = income * 0.71;
        }
        else if (income < 151978 && income > 98040) {
            deductions = income * 0.26;
            System.out.println("Your total deduction from your income was $" + (Math.round(deductions * 100)/100));
            incomeAfterTax = income * 0.74;
        }
        else if (income < 98040 && income > 49020) {
            deductions = income * 0.205;
            System.out.println("Your total deduction from your income was $" + (Math.round(deductions * 100)/100));
            incomeAfterTax = income * 0.795;
        }
        return incomeAfterTax;
    }
}