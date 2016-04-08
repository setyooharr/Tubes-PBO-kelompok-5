package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class Proyek {
    private String nama;
    private ArrayList<Programmer> arrayProgrammer;
    private ArrayList<Tugas> arrayTugas;
    private String status; 
    private String perusahaan;
    private int maxAnggota;
    private int maxTugas = 10;
    private int nAnggota;
    private int nTugas = 0;

    public Proyek() {
    }
        
    public Proyek(String nama, String perusahaan) {
        this.nama = nama;
        this.perusahaan = perusahaan;
        maxAnggota = 5;
        nAnggota = 0;
        arrayProgrammer = new ArrayList<>(maxAnggota);
        arrayTugas = new ArrayList<>(maxTugas);
    }
    
    public Proyek(String nama, String perusahaan, int maxAnggota) {
        this.nama = nama;
        this.perusahaan = perusahaan;
        nAnggota = 0;
        this.maxAnggota = maxAnggota;
        arrayProgrammer = new ArrayList<>(maxAnggota);
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public String getPerusahaan() {
        return perusahaan;
    }
    
    public void createTugas(String nama, String deadline){
        Tugas tugas = new Tugas(nama, deadline);
        arrayTugas.add(tugas);
        nTugas++;
    }
    
    public void addAnggota(Programmer p){
        if(nAnggota<=maxAnggota){
            arrayProgrammer.add(p);
            nAnggota++;
        }
        else{
            System.out.println("---Jumlah Anggota Melebihi Batas---");
        }
    }

    public Programmer getAnggota(String id) {
        for(Programmer p : arrayProgrammer){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
        
    public void delAnggota(String id){
        for(Programmer p : arrayProgrammer){
            if(p.getId().equals(id)){
                arrayProgrammer.remove(p);
                System.out.println("Anggota dengan id "+id+" sudah terhapus");
                return;
            }
        }
        System.out.println("Anggota dengan id "+id+" tidak ditemukan");
    } 

    public int getMaxAnggota() {
        return maxAnggota;
    }

    public void setMaxAnggota(int maxAnggota) {
        this.maxAnggota = maxAnggota;
    }

    public ArrayList<Programmer> getArrayProgrammer() {
        return arrayProgrammer;
    }

    public ArrayList<Tugas> getArrayTugas() {
        return arrayTugas;
    }

    public int getMaxTugas() {
        return maxTugas;
    }

    public int getnAnggota() {
        return nAnggota;
    }

    public int getnTugas() {
        return nTugas;
    }

    public void setArrayTugas(ArrayList<Tugas> arrayTugas) {
        this.arrayTugas = arrayTugas;
    }
    
    public Tugas getTugas(String nama){
        for(Tugas t : arrayTugas){
            if(t.getNama().equals(nama)){
                return t;
            }
        }
        return null;
    }
}