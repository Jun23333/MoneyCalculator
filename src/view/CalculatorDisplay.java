package view;

import java.util.Scanner;
import model.Rate;

public class CalculatorDisplay {
    private Rate rate;
    double amount;
    double exchangerate;
    String currencyFrom;
    String currencyTo;
    
    public CalculatorDisplay() {
        this.rate = new Rate();
    }
    
    private void input() {
        System.out.println("Introduce una cantidad: ");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextDouble();
        
        System.out.println("Introduce una divisa inicial: ");
        currencyFrom = scanner.next();
        
        System.out.println("Introduce una divisa final: ");
        currencyTo = scanner.next();
    }

    private void process(){
        exchangerate = rate.getRate(currencyTo)/rate.getRate(currencyFrom);
    }

    private void output() {
        System.out.println(amount + " " + currencyFrom + " = " +
                amount*exchangerate + " " + currencyTo);
    }
    
    public void display() {
        input();
        process();
        output();
    }
}
