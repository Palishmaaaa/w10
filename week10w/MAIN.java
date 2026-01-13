package week10w;

public class MAIN { 
    //Qno 1
    public static void main(String[] args) {

        //creates doctor object
        Doctor doctor1 = new Doctor( //calls doctor constructor
                101, "Ram", 50000,
                "Dentist", 20000
        );

        //creates nurse object
        Nurse nurse1 = new Nurse(
                201, "Priya", 30000,
                "Night", 5000
        );

        Nurse nurse2 = new Nurse(
                202, "Maria", 28000,
                "Day", 3000
        );

        System.out.println("Doctor Details:");
        System.out.println(doctor1);
        System.out.println("Salary with Emergency Cases: "
                + doctor1.calculateSalary(3));

        System.out.println("\nNurse Details:");
        System.out.println(nurse1);
        System.out.println(nurse2);
        
        //Qno.2
        BikeDelivery b = new BikeDelivery(212, "Sita",30000);
        b.calculatePayment(5);
        System.out.println(b);
       
        CarDelivery c= new CarDelivery(212, "Bita", 35000);
        System.out.println(c);
        
          
        //  QUESTION 3
        ScienceStudent s= new ScienceStudent(21, "Krish", 70);
        System.out.println(s);
       
        ManagementStudent m = new ManagementStudent(25, "Song", 40);
        System.out.println(m);
        
        //Question 4
         SavingAccount sa = new SavingAccount(101, "A", 1000);
        CurrentAccount ca = new CurrentAccount(102, "B", 2000);

        System.out.println(sa.getCompountInterest(1));
        System.out.println(ca.getCompountInterest(1));
       
        // QUESTION 5
        Order o1=new Order(25, "Anuska", 57000);
        PremiumOrder p1=new PremiumOrder(1,"Leo",11000);
        NormalOrder n1=new NormalOrder(26,"Angea", 89500);
        System.out.println(p1);
        System.out.println(n1);
        System.out.println("Total amount of normal order with discount: Rs."+n1.calculateAmount(10000));;
        System.out.println("hello");
    }
}
    




