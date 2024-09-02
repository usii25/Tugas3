/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityMemberCase;

/**
 *
 * @author user
 */
public class Alumnus extends CommunityMember{
    private String prodi;
    private int angkatan;
    private int lulusanTahun;
    
    public void BelumBekerja(){
        System.out.println("Belum Bekerja");
    }
    public void SudahBekerja(){
        System.out.println("Sudah Bekerja");
    }

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
     * @return the angkatan
     */
    public int getAngkatan() {
        return angkatan;
    }

    /**
     * @param angkatan the angkatan to set
     */
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    /**
     * @return the lulusanTahun
     */
    public int getLulusanTahun() {
        return lulusanTahun;
    }

    /**
     * @param lulusanTahun the lulusanTahun to set
     */
    public void setLulusanTahun(int lulusanTahun) {
        this.lulusanTahun = lulusanTahun;
    }
}
