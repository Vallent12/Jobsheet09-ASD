public class StackSurat03 {
    Surat03[] tumpukan;
    int size;
    int top;

    public StackSurat03(int size) {
        this.size = size;
        tumpukan = new Surat03[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat03 srt) {
        if (!isFull()) {
            top++;
            tumpukan[top] = srt;
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat03 pop() {
        if (!isEmpty()) {
            Surat03 srt = tumpukan[top];
            top--;
            return srt;
        }
        return null;
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        }
        return null;
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + tumpukan[i].idSurat + ", Jenis: " + tumpukan[i].jenisIzin);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
