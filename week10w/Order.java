package week10w;

public class Order
{
    private int orderID;
    private String customerName;
    private double amount;

    public Order(int orderID,String customerName,double amount)
    {
        this.orderID=orderID;
        this.customerName=customerName;
        this.amount=amount;
    }

    public int getOrderID()
    {
        return orderID;
    }

    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
   
    public double calculateAmount()
    {
        return this.amount;

    }
   
    @Override
    public String toString()
    {
        String details="name: "+this.customerName+" id: "+orderID+" amount: "+this.amount;
        return details;
    }
   
}
