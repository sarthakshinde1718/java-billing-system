import java.util.*;
public class Billingsystem{
    public static void main(String args[]){
        int q ;
        double a;
        String n;
        double t;
        double g;
        double d;
        double gb;
        double e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of products : ");
        n = sc.nextLine();
        System.out.println("Quantity of products : ");
        q = sc.nextInt();
        System.out.println("Price of product : ");
        a = sc.nextDouble();
        t = (q*a);
        System.out.println("Total : "+ (t));
        g = (t*0.18);
        System.out.println("gst 18% : " + (g+t));
        
        gb = (g+t);
        d = (gb * 0.25);
        
        e = (gb * 0.10);
        
        if(gb > 1000){
            System.out.println("discount 25% : " + (gb-d));
        }else{
             System.out.println("discount 10% : " + (gb-e));
        }
        
    }
}