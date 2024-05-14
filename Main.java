import java.math.*;
public class Main
{
    public static void main(String args[])
    {

        int obereGrenze = 75;
        int summe = 0;
        for(int i = 1; i <= obereGrenze; i++){

            summe = summe +1;
        }

        //Prüfungsrelevant BigInteger
        BigInteger multi = new BigInteger("1");

        for(int i = 2; i <= obereGrenze; i++){

            multi = multi.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Summe: " + summe + " multi: " + multi);
        
        //Master update1
        //Master update2
    }
}
