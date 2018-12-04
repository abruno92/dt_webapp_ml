package javatextbook.arrayexercises;

/**
 * Created by antonia on 2018/03/15.
 */
public class MaxMinArray {

    public static void main(String[] args) {
        int array[] = new int[]{25, 85, 22, 15, 78, 27, 48};

        int min = getMin(array);
        System.out.println("The minumum value is: " + min);

        int max = getMax(array);
        System.out.println("The maximum value is: " + max);

        int maxMinMultiplied = min*max;
        System.out.println(maxMinMultiplied);

    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if (inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }

        }
      return maxValue;
    }


}

