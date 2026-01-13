package week10w;


public class BikeDelivery extends DeliveryPartner
{
   
 public BikeDelivery(int partnerId, String name, double basePay)
 {
     super(partnerId, name, basePay);
 }
 
 @Override
 public double calculatePayment()
 {
     return super.calculatePayment();
 }
 
 public double calculatePayment(int extraOrders)
 {
     double normalPay=this.calculatePayment();
     double perExtraOrders=100;
     double extraOrderBonus=perExtraOrders*extraOrders;
     return(extraOrderBonus+normalPay);
 }
 
 @Override
 public String toString()
 {
     return "Id= "+super.getPartnerId()+ " ,Name= "+super.getName()+ " ,Base Pay= "+super.getBasePay()+ " ,Payment= "+this.calculatePayment();
 }
}
