package Class1.HomeworkJ2;

public class HW2 {

    public static void main(String[] args) {

        System.out.println("This is for temperature conversion");

    //C==>F
        double cTemp = 21;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "°C is equal to " + fTemp + "°F");


     //C==>K
        double kTemp = cTemp + 273.15;
        System.out.println("\n" + cTemp + "C is equal to  " + kTemp + "k" );



        //F==>C
        double fTemp1 = 68;
        double cTemp2 = (fTemp1 - 32) * 5/9;
        System.out.println("\n" + fTemp1  + "°F is equal to  " +  cTemp2 + "°C" );


        //F==>K
        double fTemp2 = 60;
        double kTemp2 = (fTemp2 + 459.67) * 5/ 9;
        System.out.println("\n" + fTemp2  + "°F is equal to  " +  kTemp2 + "K" );


        //K==>F
        double kTemp3 = (fTemp1 + 459.67) * 5/ 9;
        System.out.println("\n" + kTemp3  + "K is equal to  " +  fTemp1 + "°F" );

        //K==>C
        double kTemp4 = 310;
        double cTemp4 = kTemp4 -273.15;
                System.out.println("\n" + kTemp4 + "K is equal to " + cTemp4 + "°C");


    }

}
