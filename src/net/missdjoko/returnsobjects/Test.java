package net.missdjoko.returnsobjects;

/**
 * Created by Miss_ on 26.10.2015.
 */
public class Test {

    int a;
    Test(int i){
        a=i;
    }

    Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }

}
