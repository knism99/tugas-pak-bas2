public class Enemy extends Karakter {

    public Enemy(String nama) {
        super(nama);
    }

    @Override
    public void aksi() {
        System.out.println(nama + " mencoba menggagalkan tebakanmu!");
    }
}
