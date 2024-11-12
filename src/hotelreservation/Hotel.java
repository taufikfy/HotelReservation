import java.util.ArrayList;

public class Hotel {
    private ArrayList<Kamar> daftarKamar;
    private ArrayList<Tamu> daftarTamu;
    private ArrayList<Reservasi> daftarReservasi;

    public Hotel() {
        daftarKamar = new ArrayList<>();
        daftarTamu = new ArrayList<>();
        daftarReservasi = new ArrayList<>();
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public void tambahTamu(Tamu tamu) {
        daftarTamu.add(tamu);
    }

    public ArrayList<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    public Tamu cariTamu(String nama) {
        for (Tamu t : daftarTamu) {
            if (t.getNama().equalsIgnoreCase(nama)) {
                return t;
            }
        }
        return null;
    }

    public void buatReservasi(Tamu tamu, Kamar kamar, String tanggalCheckIn, String tanggalCheckOut) {
        if (kamar.isTersedia()) {
            Reservasi reservasi = new Reservasi(tamu, kamar, tanggalCheckIn, tanggalCheckOut);
            daftarReservasi.add(reservasi);
            tamu.tambahReservasi(reservasi);
            System.out.println("Reservasi berhasil dibuat!");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public void daftarKamarTersedia() {
        System.out.println("Kamar Tersedia:");
        for (Kamar k : daftarKamar) {
            if (k.isTersedia()) {
                k.tampilkanInfoKamar();
            }
        }
    }
}
