// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class busticket{
    private static boolean [] seats = new boolean [10];
    private static Scanner scanner = new Scanner (System.in);
    public static void main (String args [])
    {
        while(true)
        {
        System.out.println("1.Reserve seat");
        System.out.println("2. Cancel reservation");
        System.out.println("3.view avalable seat");
        System.out.println("4.exit");
        
        int choice=scanner.nextInt();
        switch(choice)
        {
            case 1:reserveseat ();
                  break;
            case 1:cancelrevelvation();
                  break; 
            case 3:viewavalableSeat():
                break;
            case 4:System.exit(0);
                 break;
         default:System.out.println("invalid choice ");
                break;
                 
        }
            
        }
        
    }
    
    private static void reserveseat()
    {
        System.out.println("enter seat number(1-10)");
        int seatNumber=scanner.nextInt();
        if (seatNumber<1 || seatNumber>10)
        {
            System.out.println("invalid seat number ");
            return;
        }
        if(seats[seatNumber-1]);
        {
            System.out.println("seat reserved successfull");
        }
        private static void cancelreservation{
            System.out.println("cancel reservation (1-10)");
            int seatNumber=scanner.nextInt();
            if(seatNumber<1 || seatNumber>10)
            {
                System.out.println("invalid seatNumber");
            }
            if(seats[seatNumber-1])
            {
                System.out.println("seatnumber not reserved");
                return ;
            }
            seats[seatNumber-1]=false;
            {
                System.out.println("resevation cancel successfully ");
            }
            private static void viewavalableSeat(){
                System.out.println(x:"avalable seat :");
                for (int i=0;i<seats.length;i++)
                System.out.println((i+1)+"");
            }
        }
        System.out.println();
    }
}