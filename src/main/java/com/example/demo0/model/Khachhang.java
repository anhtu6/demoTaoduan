package com.example.demo0.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity


public class Khachhang {
    @Id
    @Column(length = 10)
    private String makhachhang;
    private String tenkhachhang;
    private Long chungminhthu;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaysinh;
    private String diachi;

    public Khachhang() {
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public Long getChungminhthu() {
        return chungminhthu;
    }

    public void setChungminhthu(Long chungminhthu) {
        this.chungminhthu = chungminhthu;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
