package GDiem;

public class Hocvien {
    private String MaHV;
    private String Hoten;
    private String Tenlop;
    private String GT   ;
    private Double Diem;

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String maHV) {
        MaHV = maHV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String tenlop) {
        this.Tenlop = tenlop;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public Double getDiem() {
        return Diem;
    }

    public void setDiem(Double diem) {
        Diem = diem;
    }

    //
    public Hocvien(){

    }
    public Hocvien(String MaHV, String Hoten, String Tenlop,String GioiTinh, Double Diem) {
        this.MaHV = MaHV;
        this.Diem = Diem;
        this.Hoten = Hoten;
        this.Tenlop = Tenlop;
        this.GT = GioiTinh;
    }
    //
    public String Ketqua(){
        if ( this.Diem >= 25){
            return "Đạt";
        }
        return "";
    }

}
