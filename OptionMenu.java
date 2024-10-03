package packATM;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Accounts
{
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<>();
    int selection;
    public void getLogin() throws IOException
    {
        int x=1;
        do{
            try{
                data.put(123456,1234);
                data.put(987654, 9876);

                System.out.println("Welcome to the ATM");
                System.out.println("enter the Customer Id");
                setCutomerNumber(sc.nextInt());

                System.out.println("enter the customer pin");
                setPinNumber(sc.nextInt());
            }
            catch(Exception e)
            {
                System.out.println("\n"+"Invalid Character(s).Input only Numbers "+"\n");
                x=2;
            }
            for(Map.Entry<Integer,Integer> entry: data.entrySet())
            {
                if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber())
                {
                    getAccountType();
                }
            }
            System.out.println("Wrong Customer or pin Number");
         
        } while(x==1);
    }
    public void getAccountType()
    {
        System.out.println("Select Your Account Type");
        System.out.println("1 for Current Account");
        System.out.println("2 for Savings Account");
        System.out.println("3 to Exit");

        selection=sc.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You For Using ATM ");
                System.exit(0);
                break;
        
            default:
            System.out.println("Wrong Input");
            getAccountType();
                break;
        }
    }
    public void getChecking()
    {
        System.out.println("Cheking account :");
        System.out.println("Press '1' to View Balance");
        System.out.println("Press '2' to Withdraw");
        System.out.println("press '3' to Deposit");
        System.out.println("press '4' to Exit");
        System.out.println("Choice: ");
        selection=sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrowInput();
                getAccountType();
                break;
            case 3 :
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For unsing ATM ");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Input");
                getAccountType();
                break;
        }
        }

        public void getSaving()
    {
        System.out.println("Saving Account :");
        System.out.println("Press '1' to View Balance");
        System.out.println("Press '2' to Withdraw");
        System.out.println("press '3' to Deposit");
        System.out.println("press '4' to Exit");
        System.out.println("Choice: ");
        selection=sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrowInput();
                getAccountType();
                break;
            case 3 :
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For unsing ATM ");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Input");
                getAccountType();
                break;
        }
    }
}
