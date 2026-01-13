package week10w;


public class Student
 {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int roll,String name, double marks)
    {
        this.rollNo=roll;
        this.name=name;
        this.marks=marks;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getMarks()
    {
        return marks;
    }

    public void setMarks(double marks)
    {
        this.marks = marks;
    }
   
    public String calculateResult()
    {
        String result;
        if(this.marks>40)
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
        return "Details--> Name: "+this.name+" Roll: "+this.rollNo+" Marks: "+this.marks;
    }
}