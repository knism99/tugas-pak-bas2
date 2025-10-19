import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;
    private int angkaRahasia;
    private Scanner input;
    private Random rand;

    public Game(Player player) {
        this.player = player;
        this.rand = new Random();
        this.input = new Scanner(System.in);
    }

    public void mulai() {
        angkaRahasia = rand.nextInt(10) + 1; // angka 1–10
        System.out.println("\n🔢 Selamat datang di Game Tebak Angka!");
        System.out.println("Saya sudah memilih angka antara 1 sampai 10.");
        System.out.println("Coba tebak, " + player.getNama() + "!\n");

        int tebakan;
        do {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();
            cekTebakan(tebakan);
        } while (tebakan != angkaRahasia);

        player.tampilkanSkor();
    }

    private void cekTebakan(int tebakan) {
        if (tebakan == angkaRahasia) {
            player.menang();
            System.out.println("Angka rahasia adalah: " + angkaRahasia);
        } else if (tebakan < angkaRahasia) {
            System.out.println("Terlalu kecil!");
            player.kalah();
        } else {
            System.out.println("Terlalu besar!");
            player.kalah();
        }
    }
}
