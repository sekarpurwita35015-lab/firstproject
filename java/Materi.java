public class Materi {
    
    public int idMateri;
    public String judulMateri;
    public String isiMateri;
    public String validasi = "Belum divalidasi"; 
    public String categorykls;
    public String waktuvalidasi = "20 Februari 2026";

    public Instruktur pembuat; 

    public void tampilkanInfo () {
        System.out.println("ID Materi      : " + idMateri);
        System.out.println("Judul          : " + judulMateri);
        System.out.println("Kategori       : " + categorykls);
        System.out.println("Isi            : " + isiMateri);
        System.out.println("Status Validasi: " + validasi); 
        System.out.println("Waktu Validasi: " + waktuvalidasi); 

        if (pembuat != null) {
            System.out.println("Dibuat Oleh    : " + pembuat.username);
        }
    }
}