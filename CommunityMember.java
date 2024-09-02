package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class ComunityMember dengan memiliki atribut nama,alamat dan email.
  Pemilihan atribut disesuaikan dengan kebutuhan ComunityMember
*/
public class CommunityMember {
    private String nama;
    private String alamat;
    private String email;

    /*Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
