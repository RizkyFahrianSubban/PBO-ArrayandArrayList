import java.util.ArrayList;

// Class Customer: data nasabah beserta daftar rekening miliknya
public class Customer {

    private String firstName;  // nama depan
    private String lastName;   // nama belakang

    // daftar rekening pakai ArrayList, jadi jumlahnya bisa bertambah terus
    private ArrayList<Account> accounts;

    // constructor: mengisi nama depan dan nama belakang
    public Customer(String namaDepan, String namaBelakang) {
        firstName = namaDepan;
        lastName = namaBelakang;
        accounts = new ArrayList<Account>();  // awalnya kosong
    }

    // mengambil nama depan
    public String getFirstName() {
        return firstName;
    }

    // mengambil nama belakang
    public String getLastName() {
        return lastName;
    }

    // menambah rekening baru ke nasabah ini
    public void setAccount(Account rekeningBaru) {
        accounts.add(rekeningBaru);
    }

    // mengambil rekening berdasarkan nomor urut (mulai dari 0)
    public Account getAccount(int nomorUrut) {
        if (nomorUrut >= 0 && nomorUrut < accounts.size()) {
            return accounts.get(nomorUrut);
        } else {
            return null;  // nomor urut tidak ada
        }
    }

    // mengetahui jumlah rekening yang dimiliki
    public int getNumOfAccounts() {
        return accounts.size();
    }
}
