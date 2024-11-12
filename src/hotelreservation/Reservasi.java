public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private String tanggalCheckIn;
    private String tanggalCheckOut;

    public Reservasi(Tamu tamu, Kamar kamar, String tanggalCheckIn, String tanggalCheckOut) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        kamar.setStatus(false); // Kamar dipesan
    }

    public void batalkanReservasi() {
        kamar.setStatus(true);
    }

    public void tampilkanInfoReservasi() {
        System.out.println("Tamu: " + tamu.getNama());
        System.out.println("Kamar: " + kamar.getNomorKamar());
        System.out.println("Tanggal Check-In: " + tanggalCheckIn);
        System.out.println("Tanggal Check-Out: " + tanggalCheckOut);
    }
}
