public class BMI {
    public static double getBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String displayBMITable() {
        return String.format("--- BMI VALUES --- %nUnderweight: less than 18.5 %nNormal: between 18.5 and 24.9 %nOverweight: between 25 and 29.9 %nObese: 30 or greater %n%n");
    }
}
