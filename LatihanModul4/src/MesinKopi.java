public class MesinKopi {
    // -- nomor 1 --
    int bijiKopi;
    int air;
    int susu;

    // -- nomor 4: Constructor --
    // Perbaikan: Tambahkan () dan kurung tutup }
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    } 

    // -- nomor 2 --
    // Perbaikan: Nama method diganti isiUlangBahan, parameter disamakan dengan isinya
    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopi += tambahKopi; 
        this.air += tambahAir;
        this.susu += tambahSusu;
    } 

    // -- nomor 3 --
    public boolean cekStokCappucino() {
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            return true;
        } else {
            return false;
        }
    } 

} 