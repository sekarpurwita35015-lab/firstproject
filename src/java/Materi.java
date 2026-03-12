public class Materi {
    
    public int idMateri;
    public String judulMateri;
    public String isiMateri;
    public String validasi;
    public String categorykls;

   
    public Instruktur pembuat; 

    public void tampilkanInfo () {
        System.out.println("ID Materi:" + idMateri);
        System.out.println("Judul:" + judulMateri);
        System.out.println("Kategori:" + categorykls);
        System.out.println("Isi:" + isiMateri);
        

        if (pembuat != null) {
            System.out.println("Dibuat Oleh (Instruktur): " + pembuat.username);
        }
    }
}