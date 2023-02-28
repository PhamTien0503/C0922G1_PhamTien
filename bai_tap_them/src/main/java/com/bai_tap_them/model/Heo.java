package com.bai_tap_them.model;

import javax.persistence.*;

@Entity
public class Heo {
    @Id
    @Column(columnDefinition = "varchar(45)")
    private String maSoHeo;
    @Column(unique = true, nullable = false)
    private String thoiGianNhap;
    @Column(unique = true, nullable = false)
    private double trongLuongNhap;
    @Column(unique = true, nullable = false)
    private String thoiGianXuat;
    @Column(unique = true, nullable = false)
    private double trongLuongXuat;
    @ManyToOne
    @JoinColumn(name = "xuat_xu_id", referencedColumnName = "id")
    private XuatXu xuatXu;

    public Heo(String maSoHeo, String thoiGianNhap, double trongLuongNhap, String thoiGianXuat, double trongLuongXuat, XuatXu xuatXu) {
        this.maSoHeo = maSoHeo;
        this.thoiGianNhap = thoiGianNhap;
        this.trongLuongNhap = trongLuongNhap;
        this.thoiGianXuat = thoiGianXuat;
        this.trongLuongXuat = trongLuongXuat;
        this.xuatXu = xuatXu;
    }

    public Heo() {
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
