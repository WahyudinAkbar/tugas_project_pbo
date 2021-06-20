import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Object 1
        Pegawai wahyudinAkbar = new Pegawai("WHY-01", "M Wahyudin Akbar", "Direktur", "Kandangan", "17-04-2019", false);
        wahyudinAkbar.absensiPegawai("m wahyudin akbar");
        wahyudinAkbar.tampilkanData();
        wahyudinAkbar.hitungGaji();

        System.out.println();

        // Object 2
        Pegawai adityaPratama = new Pegawai("WHY-02", "Aditya Pratama", "Staf", "Rantau", "21-03-2018", true);
        adityaPratama.tampilkanData();
        adityaPratama.hitungGaji();

        System.out.println();

        // Object 3
        PegawaiMagang saleh = new PegawaiMagang("MG-01", "M Saleh", "Barabai", "UNISKA", "17-06-2021", "18-08-2021");
        saleh.absensiPegawai("m saleh");
        saleh.tampilkanDataPegawaiMagang();
        saleh.hitungGajiMagang();

        System.out.println();

        // Object 4
        PegawaiMagang aldi = new PegawaiMagang("MG-02", "M Aldi", "Banjarbaru", "UNLAM", "19-06-2021", "21-07-2021");
        aldi.tampilkanDataPegawaiMagang();
        aldi.hitungGajiMagang();

        System.out.println();

        // Object 5
        Pegawai vicco = new Pegawai("WHY-03", "Vicco Dwi P", "vicco", "vicco123");

        System.out.println();

        // Object 6
        Pegawai rudi = new Pegawai("WHY-04", "Rudi Maulana", "rudi", "rudi123");
    }

}
