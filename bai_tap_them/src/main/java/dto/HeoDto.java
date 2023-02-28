package dto;

import com.bai_tap_them.model.XuatXu;

import javax.persistence.*;

public class HeoDto {

    private String maSoHeo;

    private String thoiGianNhap;

    private double trongLuongNhap;

    private String thoiGianXuat;

    private double trongLuongXuat;

    private XuatXu xuatXu;

    public HeoDto() {
    }

    public HeoDto(String maSoHeo, String thoiGianNhap, double trongLuongNhap, String thoiGianXuat, double trongLuongXuat, XuatXu xuatXu) {
        this.maSoHeo = maSoHeo;
        this.thoiGianNhap = thoiGianNhap;
        this.trongLuongNhap = trongLuongNhap;
        this.thoiGianXuat = thoiGianXuat;
        this.trongLuongXuat = trongLuongXuat;
        this.xuatXu = xuatXu;
    }

    public String getMaSoHeo() {
        return maSoHeo;
    }

    public void setMaSoHeo(String maSoHeo) {
        this.maSoHeo = maSoHeo;
    }

    public String getThoiGianNhap() {
        return thoiGianNhap;
    }

    public void setThoiGianNhap(String thoiGianNhap) {
        this.thoiGianNhap = thoiGianNhap;
    }

    public double getTrongLuongNhap() {
        return trongLuongNhap;
    }

    public void setTrongLuongNhap(double trongLuongNhap) {
        this.trongLuongNhap = trongLuongNhap;
    }

    public String getThoiGianXuat() {
        return thoiGianXuat;
    }

    public void setThoiGianXuat(String thoiGianXuat) {
        this.thoiGianXuat = thoiGianXuat;
    }

    public double getTrongLuongXuat() {
        return trongLuongXuat;
    }

    public void setTrongLuongXuat(double trongLuongXuat) {
        this.trongLuongXuat = trongLuongXuat;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }
}
