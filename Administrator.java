package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Administrator yang menjadi child class dr class Faculty
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Administrator extends Faculty{
    private String TanggungJawab;

    /**
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getTanggungJawab() {
        return tanggungJawab;
    }
    public void setTanggungJawab(String tanggungJawab) {
        this.tanggungJawab = tanggungJawab;
    }
}
