package CommunityMemberCase;
/**
 * @author Nama : Karimatuz Zahrah Firdausi
            NIM : 09020623029
 */
/*Membuat class Alumnus yang menjadi child class dr class ComunityMember
  Pemilihan atribut disesuaikan dengan kebutuhan
*/
public class Alumnus extends CommunityMember{
    private String prodi;
    private int angkatan;
    private int lulusanTahun;

    /*
     * Membuat method untuk memasukkan dan mengeluarkan nilai
     */
    public void BelumBekerja(){
        System.out.println("Belum Bekerja");
    }
    public void SudahBekerja(){
        System.out.println("Sudah Bekerja");
    }

    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getAngkatan() {
        return angkatan;
    }
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public int getLulusanTahun() {
        return lulusanTahun;
    }
    public void setLulusanTahun(int lulusanTahun) {
        this.lulusanTahun = lulusanTahun;
    }
}
