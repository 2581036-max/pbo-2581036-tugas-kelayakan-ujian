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

        // Pembuktian short-circuit evaluation
        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);
        System.out.println("cek dipanggil        : " + cek);

        /*
         * KETENTUAN 1:
         * Hasil dari versi b sama dengan versi a.
         * Kesimpulan: Operator && mengikat lebih kuat daripada ||, jadi Java membaca a persis seperti b.
         *
         * KETENTUAN 2:
         * Penjelasan kenapa `cek` berakhir di 0:
         * Pada ekspresi x, (kehadiran >= 75) bernilai false, sehingga (cek++ >= 0) tidak dievaluasi.
         * Pada ekspresi y, (nilaiTugas >= 60) bernilai true, sehingga (cek++ >= 0) tidak dievaluasi.
         * Oleh karena itu, nilai `cek` tetap 0.
         */
        scanner.close();
    }
}