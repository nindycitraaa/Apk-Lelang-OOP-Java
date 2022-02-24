/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;
import java.util.Scanner; 
import java.util.ArrayList;
public class Barang {
    Scanner myObj=new Scanner(System.in); 
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> idPetugas = new ArrayList<Integer>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>(); 
    private ArrayList<Boolean> status=new ArrayList<Boolean>(); 

    public Barang() {
        System.out.print("Masukkan Barang yang mau dilelang  : ");
        this.namaBarang.add(myObj.next());
        System.out.print("Masukkan harga awal barang         : Rp.");
        this.hargaAwal.add(myObj.nextInt());
        System.out.print("Apakah barang bisa ditawar?(yes/no): ");
        String answer  = myObj.next();
        if("yes".equals(answer)){
           this.status.add(true);
           System.out.println("Barang dapat ditawar");
        } else{
            System.out.println("Barang tidak boleh ditawar");
            this.status.add(false);
        }  
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    } 
    
    public void setIdPetugas(int idPetugas){
        this.idPetugas.add(idPetugas);
    }
    public int getIdPetugas(int idPetugas){
        return this.idPetugas.get(idPetugas);
    } 

    public void setStatus(boolean status ){
        this.status.add(status);
    }
    public boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    } 
    public void editStatus(int idBarang, boolean status){
        this.status.set(idBarang, status);
    } 
    
    public void setHargaAwal(int hargaAwal ){
        this.hargaAwal.add(hargaAwal);
    }
    public int getHargaAwal(int idBarang){
        return this.hargaAwal.get(idBarang);
    } 
    
}
