# Bank_Account_App


**_Scenario: You are a back-end developer and need to create an application to handle new customer bank reqests._**

_Your application should do the following:_

1. Read a .csv file of names, social security numbers, account type, and initial deposit
2. Use proper data structure to hold these accounts
3. Both savings and checking accounts share the following properties:

    a) deposit()
    
    b) withdraw()
    
    c) transfer()
    
    d) showinfo()
    
4. Savings Account holders are given a Safety Deposite Box, identified by a 4-digit number and accessed with a 4 digit code.
5. Savings Account holders are assigned a Debit Card with a 12 - digit number and 4 - digit PIN.
6. Both accounts will use an interface that determines the base interest rate.
    
    _Savings accounts will use 0.25 points less than the base rate._
    
    _Checking accounts will use 15% of the base rate._
    
7. The ShowInfo method should reveal relevant account information as well as information specific to the Cheking account or Savings account.