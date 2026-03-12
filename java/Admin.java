public class Admin extends User {
    String id_admin;

    public Admin(String id, String user, String pass) {
        this.id_admin = id;
        this.username = user; 
        this.password = pass; 
    }


    public void validasiMateri(Materi materi) {
        materi.validasi = "Tidak Divalidasi oleh Admin " + this.username;
        System.out.println("Sistem: Materi '" + materi.judulMateri + "' gagal divalidasi.");
    }

    public void tampilkanProfil() {
        System.out.println("ID Admin  : " + id_admin);
        System.out.println("Username  : " + username);
        System.out.println("Status    : Super Admin / Moderator");
    }
}// update terbaru sekar