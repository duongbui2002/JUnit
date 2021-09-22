public class Week4 {
    /**
     * this is function to cal.
     *
     * @param a is a.
     * @param b is b.
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * This is function to cal.
     *
     * @param arr is arr.
     * @return min of array $arr.
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * this is ffunction to calculate bMI.
     *
     * @param weight: in kg.
     * @param height: in m.
     * @return BMI index.
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = (Double) (weight / (height * height));
        String returnRate = "";
        bmi = (double) Math.round(bmi * 10) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        }
        if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        }
        if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}
