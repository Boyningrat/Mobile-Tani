package com.smallacademy.MobileTani;

import java.io.Serializable;

public class UserPetani implements Serializable {
    private String FullName;
    private String Useremail;
    private String password;
    private String address;
    private String more;
    private String Phonenumber;
    private String Housephone;
    private String picprofil;
    private String Nama;
    private String Deskripsi;
    private Double Harga;
    private Double jmlhbarang;
    private String picbarang;
    private String jenis;

    public UserPetani(){}
    public UserPetani(String name,String email, String Phonenumber) {
        this.FullName = name;
        this.Useremail = email;
        this.Phonenumber = Phonenumber;
    }

    public String getFullName() {
        return FullName;
    }

    public String getUseremail() {
        return Useremail;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setFullName(String name) {
        this.FullName = name;
    }

    public void setUseremail(String useremail) {
        this.Useremail = useremail;
    }

    public void setPhonenumber(String phonenumber) {
        this.Phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getHousephone() {
        return Housephone;
    }

    public void setHousephone(String housephone) {
        Housephone = housephone;
    }

    public  String getPicprofil(){
        return picprofil;
    }
    public void setPicprofil(String picprofil){
        this.picprofil=  picprofil;
    }

    public String getNama(){return Nama;}
    public void  setNama(String Nama){
        this.Nama= Nama;
    }
    public String getDeskripsi(){return  Deskripsi;}
    public void setDeskripsi(String Desrkripsi){
        this.Deskripsi= Desrkripsi;
    }
    public  String getPicbarang(){
        return picbarang;
    }
    public void setPicbarang(String picbarang){
        this.picbarang=  picbarang;
    }
    public Double getHarga(){return Harga;}
    public void setHarga(double Harga){
        this.Harga = Harga;
    }
    public Double getJmlhbarang(){return jmlhbarang;}
    public void setJmlhbarang(double jmlhbarang){
        this.jmlhbarang = jmlhbarang;
    }
    public  String getjenis(){
        return jenis;
    }
    public void setjenis(String jenis){
        this.jenis=  jenis;
    }

}