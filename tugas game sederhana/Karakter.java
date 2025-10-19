public class Karakter {
    protected String nama;

    public Karakter(String nama) {
        this.nama = nama;
    }

    public void aksi() {
        System.out.println(nama + " sedang diam...");
    }

    public String getNama() {
        return nama;
    }
}
