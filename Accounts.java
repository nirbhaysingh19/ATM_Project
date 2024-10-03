package packATM;

import java.text.*;
import java.util.*;
public class Accounts {
    Scanner cs=new Scanner(System.in);
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0.0;
    private double savingBalance=0.0;

    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    public int setCutomerNumber(int customerNumber)
    {
        this.customerNumber=customerNumber;
        return customerNumber;
    }

    public int setPinNumber(int pinNumber)
    {
        this.pinNumber=pinNumber;
        return pinNumber;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public int getPinNumber()
    {
        return pinNumber;
    }

    public double getCheckingBalance()
    {
        return checkingBalance;
    }

    public double getSavingBalance()
    {
        return savingBalance;
    }

    public double calcCheckingWithdrow(double amount)
    {
            checkingBalance=(checkingBalance-amount);
            return checkingBalance;
    }
    
    public double calcSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount )
    {
        savingBalance=savingBalance+amount;
        return savingBalance;
    }

    public void getCheckingWithdrowInput()
    {
        System.out.println("Checking Account Balance "+ moneyFormat.format(checkingBalance));
        System.out.println("amount you want to withdraw ");
        double amount=cs.nextDouble();
        if((checkingBalance-amount)>=0)
        {
            calcCheckingWithdrow(amount);
            System.out.println("new Checking Balance is:"+moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance cannot be negative ");
        }
    }

    public void getSavingWithdrowInput()
    {
        System.out.println("Saving Account Balance "+ moneyFormat.format(savingBalance));
        System.out.println("amount you want to withdraw ");
        double amount=cs.nextDouble();
        if((savingBalance-amount)>=0)
        {
            calcSavingWithdraw(amount);
            System.out.println("new Saving Balance is:"+moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance cannot be negative ");
        }
    }

    public void getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance "+ moneyFormat.format(checkingBalance));
        System.out.println("amount you want to Deposit ");
        double amount=cs.nextDouble();
        if((checkingBalance+amount)>=0)
        {
            calcCheckingDeposit(amount);
            System.out.println("new Checking Balance is:"+moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance cannot be negative ");
        }
    }

    public void getSavingDepositInput()
    {
        System.out.println("Saving  Account Balance "+ moneyFormat.format(savingBalance));
        System.out.println("amount you want to Deposit ");
        double amount=cs.nextDouble();
        if((savingBalance+amount)>=0)
        {
            calcSavingDeposit(amount);
            System.out.println("new Saving Balance is:"+moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance cannot be negative ");
        }
    }

}
