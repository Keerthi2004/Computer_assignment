//Write a program to input twenty names in an array. Arrange these names in descending order of alphabets , using the bubble sort technique.  
import java.util.*;
public class bubble_string
{
       public static void main()
          {
            Scanner cy=new Scanner(System.in);
            String m[]=new String[20],t;
            System.out.println("Enter names in the array : ");
               for(int i=0;i<m.length;i++)
               {
                  System.out.print("m["+i+"] :");
                  m[i]=cy.nextLine();
               }
               for(int i=0;i<m.length-1;i++)
               {
               for(int j=i+1;j<m.length;j++)
               if(m[i].compareTo(m[j])<0)
               {
                 t=m[i];
                 m[i]=m[j];
                 m[j]=t;
               }
               }
                System.out.println("Sorted array : ");
               for(int i=0;i<m.length;i++)
               System.out.println(m[i]);
       }
}