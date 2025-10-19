public class Main {
    public static void main(String[] args) {
        Player p = new Player("Dimas");
        Enemy e = new Enemy("AI");

        // Polimorfisme — method aksi() berperilaku berbeda
        p.aksi();
        e.aksi();

        Game game = new Game(p);
        game.mulai();
    }
}
