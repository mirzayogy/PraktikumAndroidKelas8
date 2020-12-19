package com.mirzayogy.praktikumandroidkelas8;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentJava implements Parcelable {
    String npm;
    String nama;
    int jumlahMatakuliah;
    double ipk;
    String nomorTelepon;

    public StudentJava(String npm, String nama, int jumlahMatakuliah, double ipk, String nomorTelepon) {
        this.npm = npm;
        this.nama = nama;
        this.jumlahMatakuliah = jumlahMatakuliah;
        this.ipk = ipk;
        this.nomorTelepon = nomorTelepon;
    }

    protected StudentJava(Parcel in) {
        npm = in.readString();
        nama = in.readString();
        jumlahMatakuliah = in.readInt();
        ipk = in.readDouble();
        nomorTelepon = in.readString();
    }

    public static final Creator<StudentJava> CREATOR = new Creator<StudentJava>() {
        @Override
        public StudentJava createFromParcel(Parcel in) {
            return new StudentJava(in);
        }

        @Override
        public StudentJava[] newArray(int size) {
            return new StudentJava[size];
        }
    };

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahMatakuliah() {
        return jumlahMatakuliah;
    }

    public void setJumlahMatakuliah(int jumlahMatakuliah) {
        this.jumlahMatakuliah = jumlahMatakuliah;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(npm);
        parcel.writeString(nama);
        parcel.writeInt(jumlahMatakuliah);
        parcel.writeDouble(ipk);
        parcel.writeString(nomorTelepon);
    }
}
