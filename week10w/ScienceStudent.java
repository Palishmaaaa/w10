package week10w;


public class ScienceStudent extends Student
{
   
    public ScienceStudent(int roll,String name,double marks)
    {
        super(roll,name,marks);

    }
   
    @Override
    public String calculateResult()
    {
        String result;
        if(super.getMarks()>50)
        {
            result="Pass";
        }
        else {
            result="Fail";
        }
        return result;
    }
   
    @Override
    public String toString()
    {
        return super.toString();
    }
   
}