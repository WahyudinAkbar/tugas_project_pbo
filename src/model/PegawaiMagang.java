package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PegawaiMagang extends Pegawai {
    // Atribut
    String asalKampus;
    int lamaMagang;
    Date tglMulaiMagang, tglAkhirMagang;

    // Method 1
    int hitungLamaMagang() {
        Calendar tglMulaiMagang = Calendar.getInstance();
        tglMulaiMagang.setTime(this.tglMulaiMagang);
        Calendar tglAkhirMagang = Calendar.getInstance();
        tglAkhirMagang.setTime(this.tglAkhirMagang);

        int selisihBulan = tglAkhirMagang.get(Calendar.MONTH) -  tglMulaiMagang.get(Calendar.MONTH);

        if (tglAkhirMagang.get(Calendar.DAY_OF_MONTH) < tglMulaiMagang.get(Calendar.DAY_OF_MONTH)) {
            selisihBulan--;
        }

        return selisihBulan;
    }

    // Method 2
    void hitungGajiMagang() {
        int gajiPerBulan = 2000000;

        int gajiTotal = lamaMagang * gajiPerBulan;

        System.out.println("---------------------------------");
        System.out.println(" Menghitung Gaji Pegawai Magang  ");
        System.out.println("---------------------------------");

        System.out.println("Gaji Per Bulan = " + gajiPerBulan);
        System.out.println(this.nama + " Magang Selama " + lamaMagang + " Bulan = " + lamaMagang + " * " + gajiPerBulan);
        System.out.println("Total Gaji " + this.nama + " = " + gajiTotal);
    }

    void tampilkanDataPegawaiMagang() {
        String polaTanggal = "dd-MM-yyyy";
        String absen;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("---------------------------------");
        System.out.println("       Data Pegawai Magang       ");
        System.out.println("---------------------------------");
        System.out.println("ID Pegawai = " + this.idPegawai);
        System.out.println("Nama = " + this.nama);
        System.out.println("Asal Kampus = " + this.asalKampus);
        System.out.println("Jabatan = " + this.jabatan);
        System.out.println("Alamat = " + this.alamat);
        System.out.println("Tanggal Mulai Magang = " + simpleDateFormat.format(this.tglMulaiMagang));
        System.out.println("Tanggal Akhir Magang = " + simpleDateFormat.format(this.tglAkhirMagang));
        System.out.println("Lama Magang = " + this.lamaMagang + " Bulan");

        if (this.absen) {
            absen = "Hadir";
        } else {
            absen = "Tidak Hadir";
        }

        System.out.println("---------------------------------");
        System.out.println("         Absensi Pegawai         ");
        System.out.println("---------------------------------");
        if (pesanAbsen.isEmpty()) {
            System.out.println(this.nama + " " + simpleDateFormat.format(new Date()) + " = " + absen);
        } else {
            System.out.println(pesanAbsen);
        }
    }
}
