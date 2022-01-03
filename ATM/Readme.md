Design an ATM using object-oriented principles.

We will design ATM in a very methodical and systematic way by using the below framework:

1. Figure out all the Actors:
      Think about Actors involved and all types of user involved
2. Figure out all the User Activities and Use Cases involved:
   For each type of actors, you need to think through the different features that they would be interested in using, and different activities that they would be doing.
3. Figure out all Entities involved:

The Actors and Entities become Classes that we need to design. The user activities and use cases become the methods or properties.

Actors:
Customers:
.Balance Inquiry
.Cash Withdrawal

So overall these are operation by customer

transaction 
    --> cash withdraw
    --> Deposit --> cash deposit
                --> check deposit
    --> change PIN
    --> print receipt
    --> login/logout

Entities:
Card Reader
Screen or Display
Keypad
Cash Dispenser
Deposit Slot
Printer to print receipt.
Bank Account
Bank
Transaction
Check
ATM card (credit or debit)


Few Points to think about

When card Reader read card 

fetch customer in session

from session fetch Account to withdraw deposit

fetch card to change pin

printRecepint




            transaction (Account, trasaction Id, executeTransaction

BE          
(Account, trasaction Id)                  getBalance


cash withdrawal
cashDespenser
(Account, trasactionId,amount)   withDraw, cashDespenser.withdraw()



deposit
depositSlot



cashDesposit
amount      addMoney,depositSlot.addCash()

checkDeposit
amount      addMoney,depositSlot.addCheck() 




