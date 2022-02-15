import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        double armut,elma,domat,muz,patlican;

        Scanner inp= new Scanner(System.in);
        armut= 2.14;
        elma=3.67;
        domat=1.11;
        muz=0.95;
        patlican=5;
        System.out.println("Armut kaç kilo? :");
        double akilo= inp.nextDouble();
        System.out.println("Elma Kaç Kilo? :");
        double ekilo= inp.nextDouble();
        System.out.println("Domates Kaç Kilo? :");
        double  dkilo= inp.nextDouble();
        System.out.println("Muz Kaç Kilo?  :");
        double mkilo= inp.nextDouble();
        System.out.println("Patlıcan kaç kilo?  :");
        double pkilo= inp.nextDouble();
        double toplam= armut*akilo +elma*ekilo + domat*dkilo +muz*mkilo +patlican*pkilo;
        System.out.print("Toplam Tutar : "+toplam+" TL");

    }
}
