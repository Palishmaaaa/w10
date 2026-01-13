package week10w;

public class DeliveryPartner
{
   private int partnerId;
   private String name;
   private double basePay;
   
   //constructor
   public DeliveryPartner( int partnerId, String name, double basePay)
   {
       this.partnerId= partnerId;
       this.name= name;
       this.basePay= basePay;
   }
   
   //Getters and setters
   public void setPartnerId(int id)
   {
        this.partnerId= partnerId; 
    }

   public int getPartnerId() 
   {
        return partnerId; 
    }
    
   public void setName(String name)
   {
       this.name= name;
   }
   
   public String getName()
   {
     return name;  
   }
   
   public void setBasePay(double BasePay)
   {
     this.basePay= basePay;  
   }
   
   public double getBasePay()
   {
       return this.basePay;
   }
   
   @Override
   public String toString() 
   {
       return "partnerId: " + partnerId + ", Name: " + name + ", basePay: " + basePay;
   }
   
   public double calculatePayment()
   {
       return 0.0;
   }
   }