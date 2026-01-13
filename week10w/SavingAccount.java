package week10w;


public class SavingAccount extends BankAccount
{
    public SavingAccount(long accountNumber,String holderName, double balance)
    {
        super(accountNumber, holderName, balance); //super always first in child constructor
    }
    
    @Override
    protected double getInterest()
  {
      return 2.0;
  }
}