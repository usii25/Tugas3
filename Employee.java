package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */

/*Membuat class Employee yang menjadi child class dari class ComunityMember
  
*/
public class Employee extends CommunityMember {
    private String bidang;
    

    /**
     * @return the fakultas
     */
    public String getbidang() {
        return bidang;
    }

    /**
     * @param fakultas the fakultas to set
     */
    public void setbidang(String bidang) {
        this.bidang = bidang;
    }

}
