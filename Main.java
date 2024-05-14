
public class Main
{
    public static void main(String args[])
    {
        int obereGrenze = 50;
        int summe = 0;
        for(int i = 1; i <= obereGrenze; i++){
            summe = summe +1;
        }
        
        int multi = 1;
        for(int i = 1; i <= obereGrenze; i++){
            summe = summe * i;
        }
        
        System.out.println("Summe: " + summe + " multi: " + multi);
    }
}
