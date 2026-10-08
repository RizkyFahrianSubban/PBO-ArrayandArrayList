// Class Bank: menyimpan semua nasabah
public class Bank {

    // daftar nasabah pakai array biasa, ukurannya tetap 10
    private Customer[] customers;

    // penanda: sudah ada berapa nasabah (sekaligus posisi kosong berikutnya)
    private int numberOfCustomers;

    // constructor: menyiapkan array dengan ukuran 10
    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    // menambah nasabah baru
    public void addCustomer(String namaDepan, String namaBelakang) {
        // cek dulu, jangan sampai array penuh
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(namaDepan, namaBelakang);
            numberOfCustomers++;  // geser penanda ke posisi berikutnya
        } else {
            System.out.println("Maaf, bank sudah penuh!");
        }
    }

    // mengetahui jumlah nasabah saat ini
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // mengambil nasabah berdasarkan nomor urut (mulai dari 0)
    public Customer getCustomer(int nomorUrut) {
        if (nomorUrut >= 0 && nomorUrut < numberOfCustomers) {
            return customers[nomorUrut];
        } else {
            return null;  // nomor urut tidak ada
        }
    }
}
