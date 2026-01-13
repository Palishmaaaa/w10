package week10w;


public class NormalOrder extends Order
{
       
    public NormalOrder(int id,String name,double amount)
    {
        super(id,name,amount);
    }
   
    @Override
    public double calculateAmount()
    {
        double tax=0.13*getAmount();
        double deliveryCharge=100;
        return getAmount()+tax+deliveryCharge;
    }
   
    public double calculateAmount(double discount)
    {
        return this.calculateAmount()-discount;
    }
   
    @Override
    public String toString()
    {
        return super.toString()+"amount: "+this.calculateAmount();

    }

}
