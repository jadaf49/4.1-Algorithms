import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Algorithms
{
   private static File f;
   private static Scanner s;
   public static void main(String[] args) throws FileNotFoundException {
       f = new File("Numbers.txt");
       int odds = odds();
       int evens = evens();
       int twodigit = twodigit();
       int greaterthan = greaterthan();
       int greatestnum = greatestnum();
       int leastnum = leastnum();
       int sumofall=sumofall();
       double average=average();
       System.out.println("Odd numbers: " + odds);
       System.out.println("Even numbers: " + evens);
       System.out.println("Two digit numbers: "+ twodigit);
       System.out.println("Numbers greater than 500: "+ greaterthan);
       System.out.println("Greatest number: "+ greatestnum);
       System.out.println("Least number: "+ leastnum);
       System.out.println("Sum of all numbers: "+ sumofall);
       System.out.println("Average: "+ average);
       s.close();
   }


   public static int odds() throws FileNotFoundException{
       s = new Scanner(f);
       int odds = 0;
       while (s.hasNext()) {
           if (s.nextInt() % 2 != 0)
               odds++;
       }
       return odds;
   }
   public static int evens() throws FileNotFoundException{
       s = new Scanner(f);
       int evens = 0;
       while (s.hasNext()) {
           if (s.nextInt() % 2 == 0)
               evens++;
       }
       return evens;
   }


   public static int twodigit() throws FileNotFoundException{
       s = new Scanner(f);
       int twodigit = 0;
       while (s.hasNext()) {
           if (s.nextInt() >9 && s.nextInt() <99)
               twodigit++;
       }
       return twodigit;
   }
   public static int greaterthan() throws FileNotFoundException{
       s = new Scanner(f);
       int greaterthan = 0;
       while (s.hasNext()) {
           if (s.nextInt() >500)
               greaterthan++;
       }
       return greaterthan;
   }
   public static int greatestnum() throws FileNotFoundException{
       s = new Scanner(f);
       int greatestnum = 0;
       while (s.hasNext()) {
           if (s.nextInt() > greatestnum)
               greatestnum=s.nextInt();
       }
       return greatestnum;
   }
   public static int leastnum() throws FileNotFoundException{
       s = new Scanner(f);
       int leastnum = 0;
       while (s.hasNext()) {
           if (s.nextInt() < leastnum)
               leastnum=s.nextInt();
       }
       return leastnum;
   }


   public static int sumofall() throws FileNotFoundException{
       s = new Scanner(f);
       int sumofall = 0;
       while (s.hasNext()) {
           sumofall+=s.nextInt();
       }
       return sumofall;
   }


   public static double average() throws FileNotFoundException{
       s = new Scanner(f);
       double totalsum = 0;
       double numofnums = 0;
       double average=0;
       while (s.hasNext()) {
           totalsum+=s.nextInt();
           numofnums++;
           }
       average = totalsum/numofnums;
       return average ;
       }
      


  
}



