import java.util.Scanner;
public class FinalmockTest3 {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);

        System.out.print("Enter time you buy:");

        int i=0;
        int time=0;
        do{
        time= get.nextInt();
        if (time<19) {
            System.out.println("Enter the valid rage (19-23) [in 24 hour of time frame]");
            i=1;
        }else if (time>23) {
            System.out.println("Enter the valid rage (19-23) [in 24 hour of time frame]");
            i=1;
        }
        }while(i==1);

        System.out.println("Enter the amount you buy");
        double totalAmount= get.nextDouble();

        double finalTotal=calDiscount( time, totalAmount);
        displayGift(finalTotal);

    }

    public static double calDiscount(int time,double totalAmount) {

        int disPersentage=0;
        if(19<time && 21>time){
            if(totalAmount>=5000){
                disPersentage=10;
            }else if(5000>totalAmount&&totalAmount>=5000){
                disPersentage=7;
            }
        }else if(22<time && 23>time){
            if(totalAmount>=5000){
                disPersentage=12;
            }else if(5000>totalAmount&&totalAmount>=5000){
                disPersentage=9;
            }
        }

        double finalTotal=totalAmount*(1-disPersentage);
        
        return finalTotal;
        
    }

    public static void displayGift(double finalTotal) {

        String gift=" ";
        if(finalTotal>=7000){
            gift="Packet of Milk";
        }else if(finalTotal<=6999 && 5000<finalTotal){
            gift="Packet of 6Eggs";
        }else if(finalTotal<=4999 && 3000<finalTotal){
            gift="1 Kg of Sugar";
        }else if(3000>=finalTotal){
            gift="No Gift";
        }

        System.out.println("you are ekligible to get as free :"+gift);
        
    }


}
