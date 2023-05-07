import java.util.*;
public class Electricity_Bill {

    public static void main(String args[]) {
        

        Scanner sc = new Scanner(System.in);
        double amt=0.0;
        System.out.println("Enter Consumer Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Consumer Number : ");
        long cno= sc.nextLong();
        System.out.println("Enter Number of units consumed: ");
        int u=sc.nextInt();
        if(u<=100)
        amt=u*5.50;
        else if(u>100 && u<=300)
        amt=100*5.50+(u-100)*6.50;
        else if(u>300 && u<=600)
        amt=100*5.50+200*6.50+(u-300)*7.50;
        else if(u>600)
        amt=100*5.50+200*6.50+3000*7.50+(u-600)*8.50;

        System.out.println("\nConsumer Name:"+ name);
        System.out.println("Consumer Number:"+ cno);
        System.out.println("Number of units consumed:"+u);
        System.out.println("Amount to be paid :"+amt);
        




            
      

    }
    
}
