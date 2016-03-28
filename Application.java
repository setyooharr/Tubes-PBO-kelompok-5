/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

/**
 *
 * @author biyan
 */
public class Application {
    private ArrayList<Programmer> listProgrammer = new ArrayList();
    private ArrayList<ManajerProyek> listManajer = new ArrayList();
    
    public void insertManajerProyek (String id, String nama){
        listManajer.add(new ManajerProyek(id, nama));
    }
    
    public void insertProgrammer (String id, String nama){
        listProgrammer.add(new Programmer(id, nama));
    }
    
    public ManajerProyek cariManajerProyek(String nama){
        for(ManajerProyek m : listManajer){
            if(m.getNama().equals(nama)){
                return m;
            }
        }
        return null;
    }
    
    public ManajerProyek getManajerProyek (int i){
        return listManajer.get(i);
    }
    
    public Programmer cariProgrammer (String nama){
        for(Programmer p : listProgrammer){
            if(p.getNama().equals(nama)){
                return p;
            }
        }
        return null;
    }

    public Programmer getProgrammer(int i) {
        return listProgrammer.get(i);
    }
    
    
    
}
