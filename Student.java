package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
public class Student extends CommunityMember {
    private String prodi;
    private String fakultas;
    private int semester;

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the fakultas
     */
    public String getFakultas() {
        return fakultas;
    }

    /**
     * @param fakultas the fakultas to set
     */
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
