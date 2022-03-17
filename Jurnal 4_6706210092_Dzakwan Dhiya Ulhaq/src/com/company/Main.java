package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<MusicList> listMusic = new LinkedList<MusicList>();
        Scanner input = new Scanner(System.in);
        String judulLagu;
        String penyanyi;
        int pilihan = 0;

        while(pilihan != 4){
            System.out.println("Menu Playlist Lagu:");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Play Lagu");
            System.out.println("4. keluar");
            ListIterator<MusicList> iterator = listMusic.listIterator();
            pilihan = input.nextInt();

            if(pilihan == 1){
                System.out.println("Masukkan Judul dan Nama Penyayi/Band:");
                judulLagu = input.next();
                penyanyi = input.next();
                listMusic.add(new MusicList(judulLagu, penyanyi));
                System.out.println("Lagu Berhasil Ditambahkan.");
                System.out.println("--------------------------");
            }

            else if(pilihan == 2){
                System.out.println("Pilih opsi hapus:");
                System.out.println("1. Hapus Lagu Terakhir di Tambah");
                System.out.println("2. Hapus Lagu Berdasarkan Judul");
                System.out.println("3. Kembali");
                int pilihRemove = input.nextInt();
                while (pilihRemove != 3) {
                    if (pilihRemove == 1) {
                        listMusic.removeLast();
                        System.out.println("Lagu Terbaru Berhasil Dihapus.");
                        System.out.println("------------------------------");
                        break;
                    }
                    else if (pilihRemove == 2) {
                        ListIterator<MusicList> iter = listMusic.listIterator();
                        System.out.println("Masukkan Judul Lagu yang akan dihapus:");
                        String judul = input.next();
                        while (iter.hasNext()) {
                            MusicList lagu = iter.next();
                            if (lagu.judul().equals(judul)) {
                                iter.remove();
                            }
                        }
                        System.out.println("Lagu Berhasil Dihapus.");
                        System.out.println("----------------------");
                        break;

                    }
                    if (pilihRemove == 3) {
                        break;
                    }

                }

            }

            else if(pilihan == 3) {
                System.out.println("Memainkan Lagu :");

                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                while (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                }
                System.out.println("----------------------");
            }

        }

    }

}
