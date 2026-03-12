public class Main {
     public static void main(String[] args) {
        
    
        Materi m1 = new Materi();
        m1.idMateri = 1;
        m1.judulMateri = "Pengenalan Objek Java";
        m1.categorykls = "Pemrograman Berbasis Objek";
        m1.isiMateri = "mengubah ERD menjadi Class dan Object";

 
        Instruktur i1 = new Instruktur("001", "sekar_java", "rahasia123");
        m1.pembuat = i1; 

   
        Admin admin1 = new Admin("ADM01", "admin_java", "admin123");

        System.out.println("-- Status Materi --");
        m1.tampilkanInfo();

        System.out.println("\n-------------------------------------------");
      
        admin1.validasiMateri(m1);
        System.out.println("-------------------------------------------\n");

        System.out.println("-- Status Materi --");
        m1.tampilkanInfo();

        System.out.println("\n-- Data Profil Pengguna --");
        i1.tampilkanProfil();
        admin1.tampilkanProfil();
    }
}