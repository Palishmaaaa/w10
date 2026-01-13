package week10w;

public class CarDelivery extends DeliveryPartner
{
    public CarDelivery(int partnerId, String name, double basePay)
 {
     super(partnerId, name, basePay);
 }
 
 @Override
 public double calculatePayment()
 {
     return super.calculatePayment();
 }
 
 @Override
 public String toString()
 {
     return "Id= "+super.getPartnerId()+ " ,Name= "+super.getName()+ " ,Base Pay= "+super.getBasePay()+ " ,Payment= "+this.calculatePayment();
 
 }
 
}