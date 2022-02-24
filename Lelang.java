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
import java.util.Collections;
import java.util.Scanner;


public class Lelang {

    Scanner myObj = new Scanner(System.in); 
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>(); 

    public Lelang() {
        this.idMasyarakat.add(0);
        this.idMasyarakat.add(1);
        this.idMasyarakat.add(2);
        this.idMasyarakat.add(3);
        this.idMasyarakat.add(4);
        this.idBarang.add(0);
        this.hargaTawar.add(0);
        this.hargaTawar.add(0); 
        this.hargaTawar.add(0); 
    }
  
    public void prosesLelang(Masyarakat masyarakat, Lelang lelang, Barang barang){
    ArrayList<Integer> idBarang = new ArrayList<Integer>();
    int i=0;
    int idmasyarakat = 0;
    String temp;
    if(barang.getStatus(i)==true){ 
        System.out.println("\n======SILAHKAN MELAKUKAN PENAWARAN BARANG!======");
        do{
        System.out.print("\nApakah ada harga penawaran terbaru?[yes/no] : ");
        temp=myObj.next();
            if (!"no".equals(temp)){
                System.out.print("Masukkan Id Penawar                : ");
                idmasyarakat = myObj.nextInt(); 
                System.out.println("Selamat datang "+masyarakat.getNama(idmasyarakat)); 
                System.out.print("Masukkan harga tawar barang        : Rp.");
                int hargatawar = myObj.nextInt();
                editHargaTawar(idmasyarakat, hargatawar);
                int max=Collections.max(hargaTawar); 
                System.out.println(" ");
                i++;
            }
        }while (!"no".equals(temp)); 
            System.out.println("\nLelang ditutup! Barang sudah tidak dapat ditawar!");
            barang.editStatus(0, false); 
            System.out.println("Status barang saat ini : " +barang.getStatus(0));
            
            System.out.println("\n=======HASIL LELANG SEBAGAI BERIKUT=======");
            System.out.println("Nama Masyarakat \tNama Barang \tHarga Tawar \t");
            int x = hargaTawar.size();
            for (int j = 0; j < x; j++){
                System.out.println(masyarakat.getNama(j)+"\t\t"+barang.getNamaBarang(0)+"\t\t"+ "Rp." + hargaTawar.get(j));
            }
        int max=Collections.max(hargaTawar);  
        int maxId=hargaTawar.indexOf(max); 
        System.out.println(" ");
        System.out.println("Pemenang lelang adalah dengan harga tawar : Rp" +max+" atas nama "+masyarakat.getNama(maxId)) ;  
        System.out.println(" ");
        
    }else{
        System.out.println("\nBARANG TIDAK BOLEH DITAWAR!");
        System.out.println("\n======SILAHKAN MELAKUKAN PEMBELIAN BARANG!======");
        System.out.print("Masukkan Id Masyarakat              : ");
        idmasyarakat = myObj.nextInt(); 
        System.out.println("Selamat datang "+masyarakat.getNama(idmasyarakat)); 
        System.out.print("Apakah Anda yakin membeli " + barang.getNamaBarang(0) + 
        "\nDengan harga Rp." + barang.getHargaAwal(0) + "(yes/no)      : ");
        String answer  = myObj.next();
        if("yes".equals(answer)){
           System.out.println("BARANG BERHASIL ANDA BELI!");
           
           System.out.println("\n===========LAPORAN PEMBELIAN===========");
           System.out.println("Nama Masyarakat \tNama Barang \tHarga Barang");
            int x = barang.getHargaAwal(0);
                System.out.println(masyarakat.getNama(idmasyarakat)+"\t\t"+barang.getNamaBarang(0)+"\t\t"+ "Rp." + barang.getHargaAwal(0));
        } else{
            System.out.println("BARANG TIDAK JADI ANDA BELI!");
        }  
    }
    }
    
    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar){
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
    }
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    } 
    public int gethargaTawar(int id){
        return this.hargaTawar.get(id);
    } 
    public int getIdMasyarakat(int id){
        return this.idMasyarakat.get(id);
    } 
    public int getJmlLelang(){
        return this.hargaTawar.size();
    }        
    
    public void setHargaTawar(int hargaTawar){
        this.hargaTawar.add(hargaTawar);
    }
    public int getHargaTawar(int idMasyarakat){
        return this.hargaTawar.get(idMasyarakat);
    } 
    public void editHargaTawar(int idMasyarakat, int hargaTawar){
        this.hargaTawar.set(idMasyarakat, hargaTawar);
    } 
}