package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */

/*Membuat class Employee yang menjadi child class dari class ComunityMember
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Employee extends CommunityMember {
    private String bidang;
    

    /**
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getbidang() {
        return bidang;
    }
    public void setbidang(String bidang) {
        this.bidang = bidang;
    }

}
