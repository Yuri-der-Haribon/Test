
public class Main
{
    public static void main(String args[])
    {
        int og = 10;
        int summe = 0;
        for(int i = 1; i <= og; i++){
            summe = summe +1;
        }
        
        int multi = 1;
        for(int i = 1; i <= og; i++){
            summe = summe * i;
        }
        
        System.out.println("Summe: " + summe + " multi: " + multi);
    }
}
