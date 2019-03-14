import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student implements Comparable<Student>
{
 int token;
   String fname;
  double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    public int compareTo(Student s)
        {
        if(Double.compare(this.cgpa,s.cgpa)!=0)
            {
            return -Double.compare(this.cgpa,s.cgpa);
        }
        else if(this.fname.compareTo(s.fname)!=0)
            {
            if(this.fname.compareTo(s.fname)>0)
                return 1;
            else
                return -1;
        }
        else
            return Integer.compare(this.token,s.token);
    }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student>pq=new PriorityQueue<Student>();
      while(totalEvents>0){
         String e = in.next();
            if(e.compareTo("SERVED")==0)
                {
                Student s=pq.poll();
                //System.out.println(s.fname);
            }
          else
              {
                String n = in.next();
              double d=in.nextDouble();
              int t=in.nextInt();
              Student s=new Student(t,n,d);
              pq.add(s);
          }
           //Complete your code

         totalEvents--;
      }
        if(pq.isEmpty())
            System.out.println("EMPTY");
            else
            {
            while(!pq.isEmpty())
                {
                 Student s=pq.poll();
                System.out.println(s.fname);
            }
        }
    }
}
