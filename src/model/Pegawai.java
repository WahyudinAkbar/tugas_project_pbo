package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pegawai {
    // Atribut
    public String idPegawai, nama, jabatan, alamat, pesanAbsen = "";
    public int gajiPokok, lamaKerja;
    public Date tglPertamaKerja;
    public Boolean menikah, absen = false;



    // Method 1
    public void absensiPegawai(String nama) {
        if (nama.equalsIgnoreCase(this.nama)) {
            this.absen = true;
        } else {
            pesanAbsen = nama + " Tidak Terdaftar di Data Pegawai";
        }
    }

    // Method 2
    public int hitungLamaKerja() {
        Calendar tglPertamaKerja = Calendar.getInstance();
        tglPertamaKerja.setTime(this.tglPertamaKerja);
        Calendar hariIni = Calendar.getInstance();

        int selisihTahun = hariIni.get(Calendar.YEAR) -  tglPertamaKerja.get(Calendar.YEAR);

        if (hariIni.get(Calendar.MONTH) < tglPertamaKerja.get(Calendar.MONTH)) {
            selisihTahun--;
        } else if (hariIni.get(Calendar.MONTH) == tglPertamaKerja.get(Calendar.MONTH) && hariIni.get(Calendar.DAY_OF_MONTH) < tglPertamaKerja.get(Calendar.DAY_OF_MONTH)) {
            selisihTahun--;
        }

        return selisihTahun;
    }

    // Method 3
    public void tampilkanData() {
        String polaTanggal = "dd-MM-yyyy";
        String absen;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("---------------------------------");
        System.out.println("          Data Pegawai           ");
        System.out.println("---------------------------------");
        System.out.println("ID Pegawai = " + this.idPegawai);
        System.out.println("Nama = " + this.nama);
        System.out.println("Jabatan = " + this.jabatan);
        System.out.println("Gaji Pokok = " + this.gajiPokok);
        System.out.println("Tanggal Pertama Kerja = " + simpleDateFormat.format(this.tglPertamaKerja));
        System.out.println("Alamat = " + this.alamat);
        System.out.println("Lama Kerja = " + this.lamaKerja + " Tahun");

        if (this.menikah) {
            System.out.println("Menikah = Sudah Menikah");
        } else {
            System.out.println("Menikah = Belum Menikah");
        }

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

    // Method 4
    public String inputJabatan(String jabatan) {
        switch (jabatan) {
            case "Direktur" -> {
                this.jabatan = jabatan;
                this.gajiPokok = 8000000;
            }
            case "Manajer" -> {
                this.jabatan = jabatan;
                this.gajiPokok = 7000000;
            }
            case "Staf" -> {
                this.jabatan = jabatan;
                this.gajiPokok = 6000000;
            }
            default -> System.out.println("Jabatan Yang Anda Masukkan Salah");
        }
        return this.jabatan;
    }

    // Method 5
    public void hitungGaji() {
        int bonus, tunjangan, gajiTotal;

        if (lamaKerja >= 1  && lamaKerja < 3) {
            bonus = 1000000;
        } else if (lamaKerja >= 3 ) {
            bonus = 1500000;
        } else {
            bonus = 0;
        }

        if (menikah) {
            tunjangan = 750000;
        } else {
            tunjangan = 0;
        }

        gajiTotal = this.gajiPokok + bonus + tunjangan;

        System.out.println("---------------------------------");
        System.out.println("      Menghitung Total Gaji      ");
        System.out.println("---------------------------------");

        System.out.println("Gaji Pokok = " + gajiPokok);
        System.out.println("Bonus Kerja " + this.lamaKerja + " Tahun = " + bonus);
        System.out.println("Tunjangan Menikah = " + tunjangan);
        System.out.println("Total Gaji " + this.nama + " = " + gajiTotal);
    }

}
