package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class ManajerProyek extends Orang{
    private ArrayList<Proyek> arrayProyek;
    private int nProyek;

    public ManajerProyek(String id, String nama) {
        super(id, nama);
        arrayProyek = new ArrayList<>();
        nProyek = 0;
    }  
    
    public void createProyek(String nama, String kantor){
        if(nProyek<=3){
            Proyek p = new Proyek(nama, kantor);
            arrayProyek.add(p);
            nProyek++;
        }
        else{
            System.out.println("---Jumlah proyek sudah melebihi batas---");
        }
    }

    public Proyek getProyek(String nama){
        for(Proyek p : arrayProyek){
            if(p.getNama().equals(nama)){
                return p;
            }
        }
        return null;
    }
    
    public int getJumlahProyek(){
        return nProyek;
    }

    public ArrayList<Proyek> getArrayProyek() {
        return arrayProyek;
    }
    
    public void setArrayProyek(ArrayList<Proyek> arrayProyek){
        this.arrayProyek = arrayProyek;
    }
}