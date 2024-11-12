public class KamarDeluxe extends Kamar {
    private String fasilitasTambahan;

    public KamarDeluxe(String nomorKamar, double hargaPerMalam, String fasilitasTambahan) {
        super(nomorKamar, "Deluxe", hargaPerMalam);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    @Override
    public void tampilkanInfoKamar() {
        super.tampilkanInfoKamar();
        System.out.println("Fasilitas Tambahan: " + fasilitasTambahan);
    }
}
