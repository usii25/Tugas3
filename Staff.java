package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Staff yang menjadi child class dr class Employee
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Staff extends Employee {
    private String departemen;

    /**
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}
