package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Student yang menjadi child class dr class ComunityMember
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Student extends CommunityMember {
    private String prodi;
    private String fakultas;
    private int semester;

    /**
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
