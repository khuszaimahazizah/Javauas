import java.text.DecimalFormat;//Hider file bilangan berkoma
import java.text.DecimalFormatSymbols;//sama saja tetapi disini menggunakan simbols untuk memunculkan rupiah(Rp)
import java.util.Scanner;//Hider file untuk melakukan scanner

public class Projekmenghitungbangundatar {//penamaan class

    public static void main(String[] args) {//method utama
        login();
    }

    static void login() {//fungsi void penamaan kelas untuk login ke program
        String data[] = {"Azizah", "202013036"};//Array yang akan dimasukan untuk login
        String nama, sandi;
        System.out.println("                  Selamat Datang di                   ");//input yang akan ditampilkan dilayar dengna printah string.ou.print
        System.out.println("                  POLITEKNIK KAMPAR                   ");
        System.out.println("                                                      ");
        System.out.println("                         AA                           ");
        System.out.println("                        A  A                          ");
        System.out.println("                       AA  AA                         ");
        System.out.println("                      AAA  AAA                        ");
        System.out.println("                    AAAAAAAAAAAA                      ");
        System.out.println("                     AAA    AAA                       ");
        System.out.println("                     AAA    AAA                       ");
        System.out.println("                     AAA____AAA                       ");
        System.out.println("                                                      ");
        System.out.println("                 -Teknik Informatika-                 ");
        System.out.println("                     Bahasa Java                      ");
        Scanner apa = new Scanner(System.in);
        System.out.print("USERNAME	 : ");//untuk menginputkan array yang sudah ditanam  kan 
        nama = apa.nextLine();
        System.out.print("PASSWORD	 : ");//untuk menginputkan array yang sudah ditanam  kan 
        sandi = apa.nextLine();// tempat penyimpanan dari inputan
        System.out.println();
        /**
         * Percabangan untuk mengecek keberadaan data
         */
        if (nama.equals(data[0]) && sandi.equals(data[1])) {//pemilihan apbila benar maka kan melaksanakan program if
            System.out.println("\t----------------------------------------");
            System.out.println("\t\t\tHallo Guys.....                     ");
            System.out.println("\t----------------------------------------");
            System.out.println();
            menu();
        } else {
            System.out.println("Sorry username is not available");//pemilihan apabila perintah masukan salah maka akan mungcul program else
            login();
        }
    }

    static void menu() {//fungsi void penamaan kelas untuk pemilihan menu
        System.out.println("\t.---------------------------------------.");//untuk menampilkan inputan ke layar
        System.out.println("\t-                                       -");
        System.out.println("\t-     Contoh Penggunaan Bahasa Java     -");
        System.out.println("\t-                                       -");
        int listterima;
        System.out.println("\t-    1. Menghitung Luas Bangun Datar    -");
        System.out.println("\t-    2. Menghitung Volume Limas         -");
        System.out.println("\t-    3. Keluar                          -");
        System.out.println("\t.---------------------------------------.");
        Scanner apa = new Scanner(System.in);
        int menu;//deklarasi tipe data integer
        System.out.print("Masukkan Kode Nomor List Program : ");
        menu = apa.nextInt();
        if (menu == 1) {//kondisi satu dimana jika user memilih satu maka program yang dijalan adalah kondisi dari if 1
            bangun();
        } else if (menu == 2) {//sama seperti diatas
            volume();
        } else if (menu == 3) {
            System.exit(0);
        } else {
            System.exit(0);
        }

    }

    static void bangun() {//fungsi void penamaan kelas untuk memilih luas bangunan 
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("-    Pilih Luas Bangunan      -");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("List Bangunan : ");
        int listterima;//deklarasi tipe data integer

        Scanner input = new Scanner(System.in);
        String bangundatar[] = {"Luas Lingkaran", "Luas Persegi", "Keluar"};//deklarasi Array menggunakan tipe data string
        System.out.println("1. " + bangundatar[0]);//indeks array 0
        System.out.println("2. " + bangundatar[1]);
        System.out.println("3. " + bangundatar[2]);

        System.out.print("Silahkan Masukan Nomor List yang akan dilakukan Perhitungan : ");
        listterima = input.nextInt();

        //percabangan
        switch (listterima) {//pemilihan bangun datar dengan switch case
            case 1:
                //menghitung luas lingkaran
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println("------------------------------");
                System.out.print("Berapa kali anda ingin menghitung : ");
                int i =input.nextInt();//deklarasi tipe data
                Double penampung[] = new Double[i];//deklarasi tipe data double

                while (0 < i) {//perulangan mengguanakn while , jika i kurang dari = 0 maka program akan berjalan, program berhenti jika 0 kurang 1
                    System.out.print("Masukan Jari-jari=>");
                    double jari2, luas, pi = 3.14;
                    Scanner terimaL = new Scanner(System.in);
                    jari2 = terimaL.nextDouble();
                    luas = pi * jari2 * jari2;
                    penampung[i-1] = luas;
                    System.out.println("Luas Lingkaran = " + luas);
                    System.out.println("---------------------------------------------------");
                    System.out.println("Proses Melakukan Perhitungan Telah Selesai");
                    i--;
                }
                urut(penampung);//unutk memanggil program penggurutan
                menu();//untuk pindah ke fungsi void main menu

                break;//mengakhirir dari case 1
            case 2://pemilihan ke 2
                //Menghitung Luas persegi 
                System.out.println("Menghitung Luas persegi");
                System.out.println("-------------------------------");
                System.out.print("Berapa kali anda ingin menghitung : "); 
                i = input.nextInt();
                Double penampung2[] = new Double[i];

                while(0 < i) {
                    System.out.print("Masukan Panjang=>");
                    Double lebar,luas2,panjang;
                    Scanner terimaL = new Scanner(System.in);   
                    panjang = terimaL.nextDouble();
                    System.out.print("Masukan Lebar=>");
                    lebar = terimaL.nextDouble();
                    luas2 = lebar * panjang;
                    penampung2[i-1] = luas2;
                    System.out.println("Luas Lingkaran : " + luas2);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Proses Melakukan Perhitungan Telah Selesai");
                    i--;
                }
                urut(penampung2);
                menu();

                break;
            case 3://pemilihan ke 3
                //jika Masukan 3
                System.out.print("Proses berakhir");
                System.exit(0);

            default://jika tidak ada pemilihan yang benar maka program akan keluar otomatis
                //jika mSasukan salah
                System.out.print("Kode tidak tersedia" + listterima + "System akan keluar");
                System.exit(0);
                System.out.println("1. Kembali ke Menu");
                System.out.println("2. Keluar");
                Scanner apa = new Scanner(System.in);
                int kondisi;
                System.out.print("Apakan Anda ingin melanjutkan program : ");
                kondisi = apa.nextInt();
                if (kondisi == 1) {//kondisi unutk menjalan program selanjutnya
                    menu();
                } else {
                    System.exit(0);
                }
        }
   }

//Contoh program yang tidak menggunakan booleshort 

    static void volume() {
        Double volume, p, l, t;
        Scanner oke = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("-            Volume Limas             -");
        System.out.println("---------------------------------------");
        
        System.out.println();
        System.out.print("Masukan panjang limas : ");
        p = oke.nextDouble();
        System.out.print("Masukan lebar limas   : ");
        l = oke.nextDouble();
        System.out.print("Masukan Tinggi limas  : ");
        t = oke.nextDouble(); 
        volume = p * l * t / 3;
        
       
        System.out.println("Jadi Volume Limas Segi Empat Adalah: " + volume);
        System.out.print("");
        System.out.println("1. Kembali ke Menu");
        System.out.println("2. Keluar");
        Scanner apa = new Scanner(System.in);
        int kondisi;
        System.out.print("Apakan Anda masih ingin melanjutkan program lain : ");
        kondisi = apa.nextInt();
        if (kondisi == 1) {
            menu();
        } else {
            System.exit(0);
            
        }

        //yang membedakan dengan aplikasi diatas kita tidak menggunakan  booble short
    

} 
    

    static void urut(Double value[]) {//fungsi void unutk menggurutkan angka
        //int jumlah, i, j, swap;
        Double swap;//deklarasi tipe data double ,dimana swap artinya menukar
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Angka Yang ingin anda urutkan :");

        Double array[] = value;//tipe data array adalalh doubel

        System.out.println("\nMasukkan " + value.length + " Buah Barang");
        System.out.println("===========================================");

        System.out.println("\nangka Belum Terurut");
        for (int a = 0; a < value.length; a++) {
            System.out.print(array[a] + " | ");
        }

        for (int i = 0; i < (value.length - 1); i++) {
            for (int j = 0; j < value.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println("\nAngka yang sudah Terurut adalah :");
        for (int i = 0; i < value.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
        System.out.println("1. Kembali ke Menu");
        System.out.println("2. Keluar");
        Scanner apa = new Scanner(System.in);
        int kondisi;
        System.out.print("Apakan Anda masih ingin program lain : ");
        kondisi = apa.nextInt();
        if (kondisi == 1) {
            menu();
        } else {
            System.exit(0);
        }//untuk menutup fungsi dari void dari pengurutan
    }//untuk menutup metode utama
}//untuk menutup nama class atau kelas
