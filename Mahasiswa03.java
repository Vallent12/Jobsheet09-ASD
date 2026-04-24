public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa03(String nama, String nim, String kelas) {
        this.nim = nama;
        this.nama = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}