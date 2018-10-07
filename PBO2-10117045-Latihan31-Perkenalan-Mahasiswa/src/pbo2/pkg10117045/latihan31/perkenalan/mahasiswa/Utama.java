/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan31.perkenalan.mahasiswa;

/**
 *
 * @author 
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan NIM dan 
 * Nama Mahasiswa
 *
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10117045";
        mhs.nama = "Alif Hermawan";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117042";
        mhs1.nama = "Muhammad Rasil Alif";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10117077";
        mhs2.nama = "Muhammad Riswanda Hasan";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
    }

}
