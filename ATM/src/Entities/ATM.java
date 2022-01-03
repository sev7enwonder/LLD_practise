package Entities;


public class ATM {
    private int atmId;
    private Address address;
    private CashDispenser cashDispenser;
    private ScreenDisplay screenDisplay;
    private AtmPrinter printer;
    private CashDepositSlot cashDepositSlot;
    private CheckDepositSlot checkDepositSlot;
    private Customer currentCustomer;

    private static ATM instance;
    private ATM(int atmid, Address address){
        this.atmId = atmid;
        this.address = address;
        this.cashDispenser = new CashDispenser();
        this.screenDisplay = new ScreenDisplay();
        this.printer = new AtmPrinter();
        this.cashDepositSlot = new CashDepositSlot();
        this.checkDepositSlot = new CheckDepositSlot();
    }

    public static ATM getInstance(int atmid,Address address){
        if(instance == null){
            return new ATM(atmid,address);
        }else return instance;
    }


    public boolean authenticateCard(AtmCard card){
        /*
            if(authentication successful ) currentCustomer card
        */
        return true;
    }

    public void logout(){
        currentCustomer = null;
    }


    public void balanceEnquiry(){
        // read from card reader get Account
        // get balance
    }

    public boolean cashWithdrawal(double amount){
        //customer.getAccount.available balance
        return true;
    }
}
