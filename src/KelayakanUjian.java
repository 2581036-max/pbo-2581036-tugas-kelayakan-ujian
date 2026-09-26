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

        scanner.close();
    }
}