/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityMemberCase;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Administrator admin = new Administrator();
        admin.setNama("Karimatuz Zahrah Firdausi");
        admin.setEmail("Karimmatuz123@gmail.com");
        admin.setAlamat("Madiun");
        admin.setbidang("Staff Fakultas");
        admin.setTugas("Administrator Fakultas");
        admin.setTanggungJawab("Mengatur segala pelayanan fakultas");
        
        System.out.println("Nama: "+admin.getNama());
        System.out.println("Email: "+admin.getEmail());
        System.out.println("Alamat: "+admin.getAlamat());
        System.out.println("Bekerja pada bagian: "+admin.getbidang());
        System.out.println("Bekerja sebagai: "+admin.getTugas());
        System.out.println("Bertanggung jawab untuk "+admin.getTanggungJawab()+"\n");
        
        Student mhs = new Student();
        mhs.setNama("Abdul");
        mhs.setEmail("abdul22@gmail.com");
        mhs.setAlamat("Yogyakarta");
        mhs.setFakultas("Teknik");
        mhs.setProdi("Teknik Elektro");
        mhs.setSemester(4);
        
        System.out.println("Nama: "+mhs.getNama());
        System.out.println("Email: "+mhs.getEmail());
        System.out.println("Alamat: "+mhs.getAlamat());
        System.out.println("Fakultas: "+mhs.getFakultas());
        System.out.println("Program Studi: "+mhs.getProdi());
        System.out.println("Semester : "+mhs.getSemester()+"\n");
        
        Alumnus almn = new Alumnus();
        almn.setNama("Ari Wibowo");
        almn.setEmail("Riwibowo123@gmail.com");
        almn.setAlamat("Denpasar");
        almn.setProdi("Sistem Informasi");
        almn.setAngkatan(2019);
        almn.setLulusanTahun(2023);
        
        System.out.println("Nama: "+almn.getNama());
        System.out.println("Email: "+almn.getEmail());
        System.out.println("Alamat: "+almn.getAlamat());
        System.out.println("Program Studi: "+almn.getProdi());
        System.out.println("Mahasiswa Angkatan: "+almn.getAngkatan());
        System.out.println("Lulusan Tahun: "+almn.getLulusanTahun()+"\n");
        
        
        
        
    }
}
