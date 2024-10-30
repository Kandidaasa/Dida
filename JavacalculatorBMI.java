
public class BMICalculator {
    public static void main(String[] args) {
        // Berat badan dalam kg
        double weight = 40.0;
        // Tinggi badan dalam cm
        double heightCm = 155.0;
        
        // Menghitung tinggi badan dalam meter
        double heightM = heightCm / 100;

        // Menghitung BMI
        double bmi = weight / (heightM * heightM);

        // Menampilkan hasil
        System.out.printf("Berat Badan: %.2f kg%n", weight);
        System.out.printf("Tinggi Badan: %.2f cm%n", heightCm);
        System.out.printf("Indeks Massa Tubuh (BMI): %.2f%n", bmi);

        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Kategori: Kekurangan berat badan");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Berat badan normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori: Kelebihan berat badan");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
public class JavacalculatorBMI {
    
}