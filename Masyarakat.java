/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author MOKLET-1
 */


import java.util.ArrayList;

public class Masyarakat implements User{

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        this.namaMasyarakat.add("luluk");
        this.alamat.add("probolinggo");
        this.telepon.add("081223445678");

        this.namaMasyarakat.add("amel");
        this.alamat.add("Madura");
        this.telepon.add("085806752070");
        
        this.namaMasyarakat.add("putri");
        this.alamat.add("surabaya");
        this.telepon.add("085806752070");
    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }
    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }
    
    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }
    
    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

}  


    