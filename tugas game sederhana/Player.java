public class Player extends Karakter {
    private int skor;

    public Player(String nama) {
        super(nama);
        this.skor = 0;
    }

    public void menang() {
        skor += 10;
        System.out.println("🎉 " + nama + " menang! Skor +10");
    }

    public void kalah() {
        skor -= 5;
        System.out.println("❌ " + nama + " kalah! Skor -5");
    }

    public void tampilkanSkor() {
        System.out.println("Skor " + nama + ": " + skor);
    }

    @Override
    public void aksi() {
        System.out.println(nama + " sedang menebak angka...");
    }
}
