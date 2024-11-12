import java.util.ArrayList;

public class Tamu {
    private String nama;
    private String nomorIdentitas;
    private String kontak;
    private ArrayList<Reservasi> daftarReservasi;

    public Tamu(String nama, String nomorIdentitas, String kontak) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.kontak = kontak;
        this.daftarReservasi = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahReservasi(Reservasi reservasi) {
        daftarReservasi.add(reservasi);
    }

    public void tampilkanInfoTamu() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Identitas: " + nomorIdentitas);
        System.out.println("Kontak: " + kontak);
        System.out.println("Reservasi Aktif:");
        for (Reservasi r : daftarReservasi) {
            r.tampilkanInfoReservasi();
        }
    }
}
