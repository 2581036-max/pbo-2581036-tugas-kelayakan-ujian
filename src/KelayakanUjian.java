import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input data
        System.out.print("Kehadiran (%) : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Nilai tugas   : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Dispensasi    : ");
        boolean dispensasi = scanner.nextBoolean();

        // 2. Perhitungan 3 versi kelayakan ujian
        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);

        // 3. Negasi dispensasi
        boolean tidakDispensasi = !dispensasi;

        // Output hasil
        System.out.println("\n===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi  : " + dispensasi);
        System.out.println();
        System.out.println("a (tanpa kurung)     : " + a);
        System.out.println("b (kurung precedence): " + b);
        System.out.println("c (kurung digeser)   : " + c);
        System.out.println("!dispensasi          : " + tidakDispensasi);
        scanner.close();
    }
}