package com.mirzayogy.praktikumandroidkelas8

import android.os.Parcel
import android.os.Parcelable

data class Mahasiswa(
    val npm: String?,
    val nama: String?,
    val ipk: Double,
    val jumlahMatakuliah:Int
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(npm)
        parcel.writeString(nama)
        parcel.writeDouble(ipk)
        parcel.writeInt(jumlahMatakuliah)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Mahasiswa> {
        override fun createFromParcel(parcel: Parcel): Mahasiswa {
            return Mahasiswa(parcel)
        }

        override fun newArray(size: Int): Array<Mahasiswa?> {
            return arrayOfNulls(size)
        }
    }
}