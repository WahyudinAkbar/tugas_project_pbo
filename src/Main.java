import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Pegawai pegawai2 = new Pegawai();
        pegawai2.idPegawai = "WHY-01";
        pegawai2.nama = "M Wahyudin Akbar";
        pegawai2.tglPertamaKerja = simpleDateFormat.parse("17-04-2019");
        pegawai2.alamat = "Kandangan, HSS";
        pegawai2.jabatan = pegawai2.inputJabatan("Staf");
        pegawai2.lamaKerja = pegawai2.hitungLamaKerja();
        pegawai2.menikah = false;
        pegawai2.absensiPegawai("m wahyudin akbar");
        pegawai2.tampilkanData();
        pegawai2.hitungGaji();

        System.out.println(" ");

        PegawaiMagang pegawaiMagang1 = new PegawaiMagang();
        pegawaiMagang1.idPegawai = "MG-01";
        pegawaiMagang1.nama = "Dodoy";
        pegawaiMagang1.asalKampus = "UNISKA";
        pegawaiMagang1.jabatan = "Magang";
        pegawaiMagang1.alamat = "Kayu Abang";
        pegawaiMagang1.tglMulaiMagang = simpleDateFormat.parse("21-05-2021");
        pegawaiMagang1.tglAkhirMagang = simpleDateFormat.parse("20-08-2021");
        pegawaiMagang1.lamaMagang = pegawaiMagang1.hitungLamaMagang();
        pegawaiMagang1.absensiPegawai("dodoy");
        pegawaiMagang1.tampilkanDataPegawaiMagang();
        pegawaiMagang1.hitungGajiMagang();
    }

}
