// Class Account: untuk menyimpan dan mengatur saldo rekening
public class Account {

    // saldo rekening (private, jadi cuma bisa diakses lewat method)
    private double balance;

    // constructor: dipanggil saat rekening baru dibuat, isinya saldo awal
    public Account(double saldoAwal) {
        balance = saldoAwal;
    }

    // mengambil saldo saat ini
    public double getBalance() {
        return balance;
    }

    // menambah saldo (setor uang)
    // kalau jumlahnya 0 atau minus, setoran ditolak
    public boolean deposit(double jumlah) {
        if (jumlah > 0) {
            balance = balance + jumlah;
            return true;   // berhasil
        } else {
            return false;  // gagal
        }
    }

    // mengurangi saldo (tarik uang)
    // kalau saldo tidak cukup, penarikan ditolak
    public boolean withdraw(double jumlah) {
        if (jumlah > 0 && balance >= jumlah) {
            balance = balance - jumlah;
            return true;   // berhasil
        } else {
            return false;  // gagal
        }
    }
}
