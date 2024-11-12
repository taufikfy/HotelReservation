import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Data awal
        hotel.tambahKamar(new Kamar("101", "Single", 500000));
        hotel.tambahKamar(new Kamar("102", "Double", 750000));
        hotel.tambahKamar(new KamarDeluxe("201", 1200000, "Jacuzzi"));

        while (true) {
            System.out.println("\n=== MENU HOTEL ===");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Daftar Kamar Tersedia");
            System.out.println("3. Tambah Tamu");
            System.out.println("4. Buat Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nomor Kamar: ");
                    String nomor = scanner.nextLine();
                    System.out.print("Tipe Kamar: ");
                    String tipe = scanner.nextLine();
                    System.out.print("Harga per Malam: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();
                    hotel.tambahKamar(new Kamar(nomor, tipe, harga));
                    break;
                case 2:
                    hotel.daftarKamarTersedia();
                    break;
                case 3:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nomor Identitas: ");
                    String identitas = scanner.nextLine();
                    System.out.print("Kontak: ");
                    String kontak = scanner.nextLine();
                    hotel.tambahTamu(new Tamu(nama, identitas, kontak));
                    break;
                case 4:
                    System.out.print("Nama Tamu: ");
                    String namaTamu = scanner.nextLine();
                    Tamu tamu = hotel.cariTamu(namaTamu);
                    if (tamu != null) {
                        System.out.print("Nomor Kamar: ");
                        String nomorKamar = scanner.nextLine();
                        Kamar kamarDipilih = null;
                        for (Kamar k : hotel.getDaftarKamar()) { // Menggunakan getter
                            if (k.getNomorKamar().equals(nomorKamar) && k.isTersedia()) {
                                kamarDipilih = k;
                                break;
                            }
                        }
                        if (kamarDipilih != null) {
                            System.out.print("Tanggal Check-In: ");
                            String checkIn = scanner.nextLine();
                            System.out.print("Tanggal Check-Out: ");
                            String checkOut = scanner.nextLine();
                            hotel.buatReservasi(tamu, kamarDipilih, checkIn, checkOut);
                        } else {
                            System.out.println("Kamar tidak tersedia.");
                        }
                    } else {
                        System.out.println("Tamu tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
