//11.	Write a program in to input and store all roll numbers, names and marks in 3 subjects of n number of students in five single dimensional arrays and display the remark based on average marks as given  
 import java.util.*;
class Grades
{
    public static void main(int n)
      {
          Scanner in = new Scanner(System.in);
          String name[] = new String[n];
          int rno[] = new int[n];
          int sub1[] = new int[n];
          int sub2[] = new int[n];
          int sub3[] = new int[n];
          System.out.println("Enter the Details : ");
          for(int i = 0;i<n;i++)
          {
              System.out.println("Enter the name ");
              name[i]=in.nextLine();
              System.out.println("Enter the Roll No ");
              rno[i] = in.nextInt();
              System.out.println("Enter the First Subject marks ");
              sub1[i]=in.nextInt();
              System.out.println("Enter the Second Subject marks ");
              sub2[i]=in.nextInt();
              System.out.println("Enter the Third Subject marks ");
              sub3[i]=in.nextInt();
              int tot = sub1[i]+sub2[i]+sub3[i];
              int avg = tot/3;
                      if(avg>=85&&avg<=100)
                               System.out.println("Excellent ");
                      else if(avg>=75&&avg<84)
                               System.out.println("Distinction ");
                      else if(avg>=60&&avg<75)
                               System.out.println("First Class ");
                      else if(avg>=40&&avg<60)
                               System.out.println("Pass ");
                      else 
                              System.out.println("Poor ");
          }
      }
}