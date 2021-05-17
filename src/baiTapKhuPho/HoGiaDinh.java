package baiTapKhuPho;

import java.util.List;

public class HoGiaDinh extends Nguoi {
    private List<Nguoi> nguoi;

    int soThanhVien;
    int soNha;

    public HoGiaDinh(String name, int age, String job, int id) {
        super(name, age, job, id);

    }

    public void setSoThanhVien(int soThanhVien){
         this.soThanhVien=soThanhVien;
     }
     public void setSoNha(int soNha){
         this.soNha=soNha;
     }
     public int getSoThanhVien(){
         return soThanhVien;
     }
     public int getSoNha(){
         return soNha;
     }
     public String toString(){
         return "so thanh vien la: "+soThanhVien+", so nha la: "+soNha;
     }
}
