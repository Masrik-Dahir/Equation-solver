package com.masrik.equation_solver;

public class Demo {

    public static double pv(double rate, double numberOfPeriod, double payment) {
        double retval = 0;
        boolean t = false;
        if (rate == 0) {
            retval = -1*((numberOfPeriod*payment));
        }
        else {
            double r1 = rate + 1;
            retval =
                    (( ( 1 - Math.pow(r1, numberOfPeriod) ) / rate ) * (t ? r1 : 1)  * payment - 0)
                            /
                            Math.pow(r1, numberOfPeriod);
        }
        return retval;
    }

    public static void main(String[] args) {
        System.out.println(Demo.pv(0.05, 20, 10000));
        System.out.println(Demo.pv(1, 1, 1));
    }
}
