package week10w;

public class PremiumOrder extends Order
{
    public PremiumOrder(int id, String name, double amount)
    {
        super(id, name, amount);
    }
   
    @Override
    public double calculateAmount()
    {
        double tax=0.13*getAmount();
        double serviceCharge=500;
        return getAmount()+tax+serviceCharge;
    }
   
    @Override
    public String toString()
    {
        return super.toString()+"\nTotal amount including tax and service charge: Rs."+this.calculateAmount()+"\n Order type=Premium";

    }

   
}
