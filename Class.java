package towdarry;

import java.util.Scanner;

 public class Class 
{
     private String courseTittle;
     private String courseCode;
     private double[][] marks;
     
     public Class(String ct, String cc, double[][] ref)
     {
         this.courseTittle = ct;
         this.courseCode = cc;
         this.marks = ref;
     }
    public void process()
    {
        System.out.println("=========================================================================================");
        System.out.printf("Welcome to the course %s(%s).\n",courseTittle,courseCode);
        System.out.println("=========================================================================================");
        printData();
        max();
        min();
        avg();
        System.out.println("=========================================================================================");
    }
 
    private void printData()
    {
        System.out.printf("%20s"," ");
        for(int i=0;i<marks[0].length;i++)
        {
            System.out.printf("Test #%-14d",i+1);
            
        }
        System.out.println("");
        System.out.println("=========================================================================================");
        for(int i=0; i<marks.length; i++)
        {
            System.out.printf("Student #%-11d",i+1);
            for(int j=0 ; j<marks[i].length;j++)
            {
                System.out.printf("%-20f",marks[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=========================================================================================");
    }
    private void max()
    {
        double max =marks[0][0];
        for(int i=1;i<marks[0].length;i++)
        {
            for(int j=1; j<marks[i].length;j++)
            {
                 if(max<marks[i][j])
                 {
                     max=marks[i][j];
                 }
                
            }
        }
        System.out.printf("Maximum No : %.2f\n",max);
    }
    private void min()
    {
        double min =marks[0][0];
        for(int i=1;i<marks[0].length;i++)
        {
            for(int j=1; j<marks[i].length;j++)
            {
                 if(min>marks[i][j])
                 {
                     min=marks[i][j];
                 }
                
            }
        }
        System.out.printf("Minimum No : %.2f\n",min);
    }
    private void avg()
    {
        double avg=0.0;
        for(int i=0; i<marks.length;i++)
        {
            for(int j=0; j<marks[i].length;j++)
            {
                avg+=marks[i][j];
            }
        }
        System.out.printf("Average No : %.2f\n",avg/(marks.length*marks[0].length));
    }
    public Class()
    {
        inputData();
    }
    private void inputData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Course Name : ");
        courseTittle = input.nextLine();
        System.out.println("Ener Course Code : ");
        courseCode = input.nextLine();
        System.out.println("How many Students are there in your Class ?");
        int row = input.nextInt();
        System.out.println("How many Test you will conduct in Class?");
        int col = input.nextInt();
        
        marks = new double[row][col];
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.printf("Enter Student No %d Test %d marks.",i+1,j+1);
                marks[i][j] = input.nextDouble();
            }
        }
                
    }
}
