import java.util.*;
public class Main {
    public static void main(String[] args) {




        ArrayList<Integer> numbersToCalculate = new ArrayList<Integer>(2);

        numbersToCalculate.add(20);
        numbersToCalculate.add(5);


       System.out.println(Arrays.toString(toPower(4,4)));



        int sum = 0;

        for (int num:numbersToCalculate){
            sum += num;

        }
        System.out.printf("Sum = %d\n",sum);

        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }
            System.out.println(index);
            }





    }
    public static int[] toPower(int size, int power) {
        int [] myArray = new int [size];

        for (int i = 0; i<myArray.length; i++){
            myArray[i] = (int)Math.pow(i, power);

        }
        return myArray;
    }



    }



