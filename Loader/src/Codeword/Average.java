package Codeword;


public class Average {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double average = 0;
        if (classPoints.length > 0) {
            double sum = 0;
            for (int i = 0; i < classPoints.length; i++) {
                sum += classPoints[i];
            }
            average = sum / classPoints.length;
        }
        if (average < yourPoints) {
            return true;

        } else return false;
    }
}