package org.example;

public class Number_ex6 {

    /**
     * This method sums every digit from a number and calculates the average value for each digit
     *
     * e.g.: 1212 => 1+2+1+2 = 6 => 6 / 4
     *
     * @param number the number to use the digits
     * @return the average value for each digit
     */
    public double numberAverage(int number){
        int i = 10;
        int count = 0;
        int digit;
        int numberSum = 0;
        while (number > 0){
            //catch the digit
            digit = number % i;
            //subtract the digit from the initial number
            number -= digit;
            //get the digital in units
            digit = digit / (i/10);
            //sum the digits
            numberSum += digit;
            //increment the iteration
            i *= 10;
            //increment the counter of digits
            count++;
            /*
            System.out.println("======================RESULTS====================\n" +
                    "NUMBER SUM: " + numberSum + "\nNUMBER: "+number+"\nI: "+ i + "\nN:" + n);
             */
        }
        return numberSum / count;
    }
}
