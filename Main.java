
public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        for(int i = 1; i <= 10; i++){
            summe = summe +1;
        }
        
        int multi = 1;
        for(int i = 1; i <= 10; i++){
            summe = summe * i;
        }
        
        System.out.println("Summe: " + summe + " multi: " + multi);
    }
}
