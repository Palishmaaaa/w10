package week10w;


public class ManagementStudent extends Student
{
   
    public ManagementStudent(int roll,String name,double marks)
    {
        super(roll,name,marks);

    }
   
    @Override
    public String calculateResult()
    {
        String result;
        if (super.getMarks() > 45) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        return result;
    }
      public String caclulateResult(double gracemarks)
    {
        double marks= super.getMarks()+gracemarks;
        String result;
        if (marks > 45) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        return result;
    }
   
    @Override
    public String toString()
    {
        return super.toString();
    }
}