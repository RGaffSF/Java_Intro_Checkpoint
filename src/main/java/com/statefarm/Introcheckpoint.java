package com.statefarm;

public class Introcheckpoint {
    public static void main(String[] args) {

        //ArrayList<Integer> arraySum = new ArrayList<Integer>();
        //arraySum = new int[args.length];
        int totalSum = 0;

        if (args.length < 1) {
            System.out.println(0);
            // return 0;
        } else {

            for (int i = 0; i < args.length; i++) {
                int x = Integer.parseInt(args[i]);
                if (x > 0) {
                    //arraySum.add(x);
                    totalSum += x;
                }
            }
            System.out.println(totalSum);
        }

        //for loop to sum positive

    }




}
