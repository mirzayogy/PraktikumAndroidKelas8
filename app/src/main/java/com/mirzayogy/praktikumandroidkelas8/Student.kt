package com.mirzayogy.praktikumandroidkelas8

import android.os.Parcel
import android.os.Parcelable

data class Student (
        val npm:String?,
        val nama:String?,
        val jumlahMatakuliah:Int,
        val ipk:Double,
        val nomorTelepon:String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readDouble(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(npm)
        parcel.writeString(nama)
        parcel.writeInt(jumlahMatakuliah)
        parcel.writeDouble(ipk)
        parcel.writeString(nomorTelepon)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}
