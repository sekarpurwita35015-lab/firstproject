public class Instruktur {
    
    String id_instruktur; 
    String username;
    String password;

    
    public Instruktur(String id, String user, String pass) {
        this.id_instruktur = id;
        this.username = user;
        this.password = pass;
    }

    
    public void tampilkanProfil() {
        System.out.println("ID Instruktur : " + id_instruktur);
        System.out.println("Username      : " + username);
        System.out.println("Status        : Aktif");
    }
}