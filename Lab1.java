import java.util.Scanner;

public class Lab1 {   //RatioOfArrayElements

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the number of elements
        int size = input.nextInt();
    

        // insert the elements of the array
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        input.close();

        float[] ratio = findingratio(numbers);

        // print ratios
        System.out.printf("Ratio of positive numbers =" + "%.3f%n", ratio[0]);
        System.out.printf("Ratio of negative numbers ="+ "%.3f%n", ratio[1]);
        System.out.printf("Ratio of zero numbers ="+ "%.3f%n", ratio[2]);
    }

    public static float[] findingratio(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int total = numbers.length;

        for (int i = 0; i < total; i++) { 
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // calculation of the ratios
        float positiveRatio = (float) positiveCount / total;
        float negativeRatio = (float) negativeCount / total;
        float zeroRatio = (float) zeroCount / total;

        return new float[]{positiveRatio, negativeRatio, zeroRatio};
    }
}
