package FrenchCise;

public class Main_project{

public static void main(String[] args){

java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Masukkan ID: ");
int id = scanner.nextInt();
scanner.nextLine();

pegawai p;
switch(id) {
	case 1:
		p = new manager();
		p.nama = "Manager";
		p.gaji = "9 Juta";
		break;
	case 2:
		p = new kasir();
		p.nama = "Abid";
		p.gaji = "1 Juta";
		break;
	case 3:
		p = new koki();
		p.nama = "Koki";
		p.gaji = "1 Juta";
		break;
	case 4:
		p = new pelayan();
		p.nama = "Pelayan";
		p.gaji = "1 Juta";
		break;
	case 5:
		p = new satpam();
		p.nama = "Satpam";
		p.gaji = "1 Juta";
		break;
	default:
		System.out.println("ID tidak valid. Keluar.");
		return;
}
p.id_pegawai = id;

System.out.println("\n--- Data Pegawai ---");
p.menampilkan();
if (p instanceof manager) ((manager)p).tugas();
else if (p instanceof kasir) ((kasir)p).tugas();
else if (p instanceof koki) ((koki)p).tugas();
else if (p instanceof pelayan) ((pelayan)p).tugas();
else if (p instanceof satpam) ((satpam)p).tugas();

}

}