package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Teacher yang menjadi child class dr class Faculty
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Teacher extends Faculty{
    private String bidangMengajar;

    /**
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getBidangMengajar() {
        return bidangMengajar;
    }
    public void setBidangMengajar(String bidangMengajar) {
        this.bidangMengajar = bidangMengajar;
    }
}
