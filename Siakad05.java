import java.util.Scanner;
public class Siakad05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absensi;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan No. Absen: ");
        absensi = sc.nextByte();
        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        nilaiKuis = nilaiKuis * 20 / 100;
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        nilaiTugas = nilaiTugas * 15 / 100;
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        nilaiUTS = nilaiUTS * 30 / 100;
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiUAS = nilaiUAS * 35 / 100;
        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " No. Absen: " + absensi);
        System.out.println("Nilai Akhir: " + nilaiAkhir);


    }
}