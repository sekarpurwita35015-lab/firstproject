public class Main {
     public static void main(String[] args) {
        Materi m1 = new Materi();

        m1.idMateri = 1;
        m1.judulMateri = "Pengenalan Objek Java";
        m1.categorykls = "Pemrograman Berbasis Objek";
        m1.isiMateri = "mengubah ERD menjadi Class dan Object";

        Instruktur i1 = new Instruktur("001", "sekar_java", "rahasia123");
        
       
        System.out.println("--Hasil Tugas 2: Pembuatan Objek--");
        m1.tampilkanInfo();

        System.out.println("\n-- Data Instruktur Baru --");
        i1.tampilkanProfil();
    
    }
    
}
