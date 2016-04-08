/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class TubesPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ManajerProyek m1 = new ManajerProyek("1123332", "Agus Subono");
        Programmer p1 = new Programmer("11232342", "Bambang Riyad");
        Programmer p2 = new Programmer("11223432", "Leo Deswanto");
        Programmer p3 = new Programmer("12234899", "Raga Agustio");
        Programmer p4 = new Programmer("12075884", "Mahardika Leo");
        
        m1.createProyek("Pembangunan Jaringan Intranet", "PT Sejati Sumber");
        m1.createProyek("Pengembangan Aplikasi Dashboard", "PT. Makmur Jaya");
        
        m1.getProyek("Pembangunan Jaringan Intranet").addAnggota(p1);
        m1.getProyek("Pembangunan Jaringan Intranet").addAnggota(p3);
        m1.getProyek("Pengembangan Aplikasi Dashboard").addAnggota(p2);
        m1.getProyek("Pengembangan Aplikasi Dashboard").addAnggota(p4);
        
        //Membuat Tugas pada Proyek "Pembangunan Jaringan Intranet"
        m1.getProyek("Pembangunan Jaringan Intranet").createTugas("Membuat Database", "11 Apr 2016");
        m1.getProyek("Pembangunan Jaringan Intranet").createTugas("Membangun Sistem Jaringan", "15 Apr 2016");
        
        //Memberikan Tugas kepada anggota proyek
        m1.getProyek("Pembangunan Jaringan Intranet").getTugas("Membuat Database").setPelaksana(p1);        
        m1.getProyek("Pembangunan Jaringan Intranet").getTugas("Membangun Sistem Jaringan").setPelaksana(p3);
        
        //Membuat Tugas pada Proyek "Pengembangan Aplikasi Dashboard"
        m1.getProyek("Pengembangan Aplikasi Dashboard").createTugas("Membangun Sistem Aplikasi", "22 Des 2016");
        m1.getProyek("Pengembangan Aplikasi Dashboard").createTugas("Mendesain UI", "7 Jan 2017");
        
        //Memberikan Tugas kepada anggota proyek
        m1.getProyek("Pengembangan Aplikasi Dashboard").getTugas("Membangun Sistem Aplikasi").setPelaksana(p2);        
        m1.getProyek("Pengembangan Aplikasi Dashboard").getTugas("Mendesain UI").setPelaksana(p4);
        
        //Programmer mengupdate progress tugasnya
        p1.updateProgress(m1.getProyek("Pembangunan Jaringan Intranet").getTugas("Membuat Database"), "60%");
        p3.updateProgress(m1.getProyek("Pembangunan Jaringan Intranet").getTugas("Membangun Sistem Jaringan"), "40%");
        p2.updateProgress(m1.getProyek("Pengembangan Aplikasi Dashboard").getTugas("Membangun Sistem Aplikasi"), "10%");
        p4.updateProgress(m1.getProyek("Pengembangan Aplikasi Dashboard").getTugas("Mendesain UI"), "");
        
        for(Proyek p : m1.getArrayProyek()){ //output
            System.out.println("Proyek : "+p.getNama());
            System.out.println("Manajer : "+m1.getNama());
            System.out.println("Nama Perusahhan : "+p.getPerusahaan());
            System.out.println("Anggota :");
            for(Programmer pm : p.getArrayProgrammer()){
                System.out.println("- ID :"+pm.getId());
                System.out.println("  Nama : "+pm.getNama());                
            }
            System.out.println(" ");
        }
        
        System.out.println("----Menghapus Anggota----");
        m1.getProyek("Pembangunan Jaringan Intranet").delAnggota("Bambang Riyad"); //menghapus anggota di proyek ke 2
        System.out.println(" ");
        
        for(Proyek p : m1.getArrayProyek()){ //output
            System.out.println("Proyek : "+p.getNama());
            System.out.println("Manajer : "+m1.getNama());
            System.out.println("Nama Perusahhan : "+p.getPerusahaan());
            System.out.println("Anggota :");
            for(Programmer pm : p.getArrayProgrammer()){
                System.out.println("- ID :"+pm.getId());
                System.out.println("  Nama : "+pm.getNama());                
            }
            System.out.println(" ");
        }*/
        Application app = new Application();
        Menu menu = new Menu(app);
        menu.MainMenu();
    }
}
