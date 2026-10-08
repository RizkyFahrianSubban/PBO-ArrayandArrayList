// Class Main: tempat mencoba semua class di atas
public class Main {
    public static void main(String[] args) {

        // 1. buat bank
        Bank bank = new Bank();

        // 2. tambah dua nasabah
        bank.addCustomer("Rizky", "Fahrian");
        bank.addCustomer("Riski", "Maulana");
        System.out.println("Jumlah nasabah: " + bank.getNumOfCustomers());

        // 3. ambil nasabah pertama, lalu buatkan dua rekening
        Customer rizky = bank.getCustomer(0);
        rizky.setAccount(new Account(500000));
        Customer riski = bank.getCustomer(1);
        riski.setAccount(new Account(1500000));

        // 4. tampilkan data nasabah
        System.out.println("Nasabah : " + rizky.getFirstName() + " " + rizky.getLastName());
        System.out.println("Punya " + rizky.getNumOfAccounts() + " rekening");

        // 5. coba setor dan tarik di rekening pertama
        Account rekening = rizky.getAccount(0);
        System.out.println("Saldo awal      : Rp" + rekening.getBalance());

        rekening.deposit(200000);
        System.out.println("Setelah setor   : Rp" + rekening.getBalance());

        rekening.withdraw(150000);
        System.out.println("Setelah tarik   : Rp" + rekening.getBalance());

        // 6. coba tarik uang melebihi saldo (harusnya ditolak)
        boolean berhasil = rekening.withdraw(9000000);
        if (berhasil) {
            System.out.println("Penarikan Rp9000000 berhasil");
        } else {
            System.out.println("Penarikan Rp9000000 gagal, saldo tidak cukup");
        }

        // 7. tampilkan semua nasabah pakai perulangan
        System.out.println("\nDaftar semua nasabah:");
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println((i + 1) + ". " + c.getFirstName() + " " + c.getLastName()
                    + " (" + c.getNumOfAccounts() + " rekening)");
        }
    }
}
