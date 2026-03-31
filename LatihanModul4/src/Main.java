public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek mesin kopi baru (stok otomatis 0 karena Constructor)
        MesinKopi mesinLobby = new MesinKopi();
        
        System.out.println("=== STOK AWAL MESIN ===");
        System.out.println("Kopi : " + mesinLobby.bijiKopi + " gram");
        System.out.println("Air  : " + mesinLobby.air + " ml");
        System.out.println("Susu : " + mesinLobby.susu + " ml\n");

        // 2. Kita isi ulang bahannya biar nggak nol banget
        mesinLobby.isiUlangBahan(50, 200, 300);

        // 3. Menampilkan output stok setelah diisi ulang
        System.out.println("\n=== STOK SETELAH DIISI ULANG ===");
        System.out.println("Kopi : " + mesinLobby.bijiKopi + " gram");
        System.out.println("Air  : " + mesinLobby.air + " ml");
        System.out.println("Susu : " + mesinLobby.susu + " ml");

        System.out.println("Stok mencukupi nih. Kuy bikin kopi");
    }
}