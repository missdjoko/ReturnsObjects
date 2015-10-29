package net.missdjoko.returnsobjects;

/**
 * Created by Miss_ on 26.10.2015.
 */
public class ReturnsObjects {
    public static void main(String[] args) {

        Test ro1= new Test(10);
        Test ro2 = ro1.incrByTen();

        ro2=ro1.incrByTen();
        System.out.println("ro1.a = " + ro1.a);
        System.out.println("ro2.a = " + ro2.a);

        ro2=ro2.incrByTen();
        System.out.println("ro2.a = " + ro2.a);
        System.out.println("ro1.a = " + ro1.a);
        


    }
}
