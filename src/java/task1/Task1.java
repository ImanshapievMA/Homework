package java.task1;

public class Task1 {
    private static String year1;

    public static void main(String[] args) {
        System.out.println ("Dagestan, Dagestan, Dagestan");
        System.out.println("Priora, Priora,Priora");
        int Java = 30;
        short Java2 = 15;
        long Java3 = 20;

        double Java4 = 33.5;
        float Java5 = 44.5f;

        char J = 'J';
        boolean A = true;

        byte Java6 = 110; // -128-127
        System.out.println(Java);
        System.out.println(Java2);
        System.out.println(Java3);

        String y = "Dagestan";
        String space = " ";
        String city = "Makhachkala";
        System.out.println(y + space + city);
        System.out.println("Dagestan " + "Kizilurt");
        System.out.println("My number " + Java);

        int value = 0;
        while (value < 10) {
            System.out.print("Java ");
            value++;
        }

        for (int i = 1; i <= 10; i = i + 1){
            System.out.println("Java " + i);
        }
        for (int t = 10; t >= 0; t = t - 1){
            System.out.println("Javasya " + t);
        }

        int year = 1980;
        while (year <= 2020) {
            System.out.println("Olimpiada " + year + " year");
            year = year + 4;
        }
        for (int ye = 1980; ye <= 2020; ye = ye + 4) {
            System.out.println("Olimpiada " + ye + " year");
        }
        int k = 3;
        for (int t = 1; t <= 9; t = t + 1){
            System.out.println(k + "*" + t + "=" + t * k);

        }
        for (int i = 0; i < 2; i++){
            System.out.println(i + "apple");
        }
        }


    }
