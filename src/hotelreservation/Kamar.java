public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private boolean status; // true = tersedia, false = dipesan

    public Kamar(String nomorKamar, String tipeKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = true; // Default tersedia
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public boolean isTersedia() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void tampilkanInfoKamar() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Harga per Malam: Rp " + hargaPerMalam);
        System.out.println("Status: " + (status ? "Tersedia" : "Dipesan"));
    }
}
