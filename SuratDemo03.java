import java.util.Scanner;
public class SuratDemo03 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stackSrt = new StackSurat03(10);
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    
                    Surat03 baru = new Surat03(id, nama, kls, jns, dur);
                    stackSrt.push(baru);
                    break;
                case 2:
                    Surat03 proses = stackSrt.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat03 cek = stackSrt.peek();
                    if (cek != null) {
                        System.out.println("Surat teratas: " + cek.idSurat + " - " + cek.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = sc.nextLine();
                    stackSrt.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}