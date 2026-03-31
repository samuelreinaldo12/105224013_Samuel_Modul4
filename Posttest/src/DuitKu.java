import java.util.Scanner;

class DuitKu {
    String namaLengkap;
    String nomorPonsel;
    int saldo;

    public AkunDuitKu(String namaLengkap, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0; 
    }

    public void isiDana(int nominal) {
        if (nominal < 10000) {
            System.out.println("[PERINGATAN KERAS] Minimum setoran adalah Rp 10.000. Transaksi dibatalkan!");
        } else {
            this.saldo += nominal;
            System.out.println("[STRUK RESI] Setoran tunai berhasil sejumlah Rp " + nominal);
            System.out.println("Saldo Anda saat ini: Rp " + this.saldo);
        }
    }

    public void lunasiTagihan(int nominalTagihan, String jenisTagihan) {
        if (this.saldo >= nominalTagihan) {
            this.saldo -= nominalTagihan;
            System.out.println("[BERHASIL] Pembayaran " + jenisTagihan + " sebesar Rp " + nominalTagihan + " sukses.");
        } else {
            System.out.println("[GAGAL MUTLAK] Saldo tidak mencukupi untuk membayar " + jenisTagihan + ".");
            System.out.println("Sisa saldo Anda: Rp " + this.saldo);
        }
    }
}