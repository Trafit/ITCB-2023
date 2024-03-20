import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Belajar1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "Laki-laki" : "Perempuan";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggalSekarang = LocalDate.now();

        int tahunSelisih = tanggalSekarang.getYear() - tanggalLahir.getYear();
        int bulanSelisih = tanggalSekarang.getMonthValue() - tanggalLahir.getMonthValue();

        if (bulanSelisih < 0) {
            tahunSelisih--;
            bulanSelisih += 12;
        }

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Umur: " + tahunSelisih + " tahun " + bulanSelisih + " bulan");

        scanner.close();
    }

    @Override
    public String toString() {
        return "Belajar1 []";
    }
}
