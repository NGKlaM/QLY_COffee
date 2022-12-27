package Qlsv;

public class SinhVien {

    private String tenSV;
        private int tuoi;
        private int sex;
    private String soThich;
    private String maSv;
        private double diemTB;

    public SinhVien(String tenSV, int tuoi, int sex, String soThich, String maSv, double diemTB) {
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.sex = sex;
        this.soThich = soThich;
        this.maSv = maSv;
        this.diemTB = diemTB;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }




    public void inThongTinSinhVien() {
            String name1 = sex == 1 ? "nam" : sex == 0 ? "nu" : "bue due";
            System.out.println("Thông tin sinh viên: ");
            System.out.println("Tên: " + tenSV + "- Tuổi: " + tuoi + "Giới tính : " + sex +"Sở thích: "+soThich+"Mã sinh viên:"+maSv+" Điểm trung bình: " + diemTB );
        }

}
