public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PENDAFTARAN PENGGUNA BARU DUITKU ===");
        System.out.print("Masukkan Nama Lengkap : ");
        String nama = input.nextLine(); 
        System.out.print("Masukkan Nomor Ponsel : ");
        String noHp = input.nextLine(); 

        AkunDuitKu penggunaSistem = new AkunDuitKu(nama, noHp);
        System.out.println("Selamat datang, " + penggunaSistem.namaLengkap + "! Saldo awal Anda: Rp " + penggunaSistem.saldo);
        System.out.println("----------------------------------------\n");
        
        System.out.println("=== AKTIVITAS 1: Setor Uang Pertama ===");
        System.out.print("Nominal yang ingin disetor: Rp ");
        int setorAwal = input.nextInt();
        penggunaSistem.isiDana(setorAwal); 
        System.out.println();

        System.out.println("=== AKTIVITAS 2: Coba Bayar Tagihan Listrik ===");
        System.out.print("Nominal tagihan listrik: Rp ");
        int tagihanListrik = input.nextInt();
        penggunaSistem.lunasiTagihan(tagihanListrik, "Listrik"); 
        System.out.println();

        System.out.println("=== AKTIVITAS 3: Setor Uang Tambahan ===");
        System.out.print("Nominal yang ingin disetor: Rp ");
        int setorTambahan = input.nextInt();
        penggunaSistem.isiDana(setorTambahan); 
        System.out.println();

        System.out.println("=== AKTIVITAS 4: Coba Bayar Tagihan Listrik Lagi ===");
        System.out.println("Mencoba melunasi tagihan yang sama (Rp " + tagihanListrik + ")...");
        penggunaSistem.lunasiTagihan(tagihanListrik, "Listrik"); 
        System.out.println();

        System.out.println("========================================");
        System.out.println("Sisa uang " + penggunaSistem.namaLengkap + " yang paling akurat di sistem: Rp " + penggunaSistem.saldo);
        
        input.close();
    }
}