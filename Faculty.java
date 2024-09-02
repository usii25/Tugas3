package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Faculty yang menjadi child class dr class Employee
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Faculty extends Employee{
    private String tugas;
    
    /**
     * Mmembuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getTugas() {
        return tugas;
    }
    public void setTugas(String tugas) {
        this.tugas = tugas;
    }
}
