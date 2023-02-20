/*Saya Anandita K NIM 2101114 mengerjakan soal Latihan 2 dalam mata kulia
h Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
//import library
import java.util.Scanner;
import java.util.ArrayList;

// main class
class Main {
    public static void main(String[] args) {
      //membuat list
		ArrayList<Mahasiswa> list = new ArrayList<>();
    //objek instantion menggunakan paramater yang ada di CONSTRUCTOR dan dimasukan kedalaam list
    Mahasiswa mhs1=new Mahasiswa("000000","2101114","Anandita","perempuan","UPI","FPMIPA","ILKOM","Ananditakusumah@upi.edu");
    list.add(mhs1);

    Mahasiswa mhs2=new Mahasiswa("000001","2101115","Do Kyungsoo","laki-laki","SM","FROZEN","ICE","Kyungsoo@upi.edu");
    list.add(mhs2);
    Mahasiswa mhs3=new Mahasiswa("000002","2101116","Suho","laki","SM","KEKAYAAN","MANAJEMEN_DUIT","SUHOLKAY@upi.edu");
    list.add(mhs3);
//menampilkan data dalam list
    for (int i = 0; i < list.size(); i++)
    {
        System.out.println();
        System.out.println("Data Mahasiswa ke-"+Integer.toString(i+1));
        System.out.println("NIK              : " + list.get(i).getNIK());
        System.out.println("NIM              : " + list.get(i).getNIM());
        System.out.println("Nama             : " + list.get(i).getNama());
        System.out.println("Jenis Kelamin    : " + list.get(i).getJenkal()); 
        System.out.println("Fakultas         : " + list.get(i).getFakultas());
        System.out.println("Program Studi    : " + list.get(i).getProdi());
        System.out.println("Asal Universitas : " + list.get(i).getAsalUniversitas());
        System.out.println("Email Edu        : " + list.get(i).getEmailEdu());
       
    }
}
}