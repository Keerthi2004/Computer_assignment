//Write a program in to input and store all roll numbers, names and marks in 3 subjects of n number of students in five single dimensional arrays and display the remark based on average marks as given below: 
import java.util.Scanner;
public class stream
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=a.nextLine();
        System.out.println("Please enter your roll number:");
        int roll=a.nextInt();
        System.out.println("Please enter the mark of five subjects one by one out of 100");
        int sub1=a.nextInt();
        int sub2=a.nextInt();
        int sub3=a.nextInt();
        int sub4=a.nextInt();
        int sub5=a.nextInt();
        
        double avg=((sub1+sub2+sub3+sub4+sub5)*100)/500;
        if(avg>=90)
        {
            System.out.println("The strem assigned for you is Science with Computers");
        }
        else if(avg>=80 && avg<89)
        {
            System.out.println("The strem assigned for you is Science without Computers");
        }
        else if(avg>=70 && avg<79)
        {
            System.out.println("The strem assigned for you is Commerce with Maths");
        }
        else 
        {
            System.out.println("The strem assigned for you is Commerce without Maths");
        }
    }
}