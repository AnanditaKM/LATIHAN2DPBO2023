/* Saya Anandita K NIM 2101114 mengerjakan soal Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
#include "Mahasiswa.cpp"

int main()
{
     list<Mahasiswa> llist;
     // mengisi list hardcode
     Mahasiswa mhs1("000000", "2101114", "anandita", "perempuan", "UPI", "FPMIPA", "ILKOM", "Ananditakusumah@upi.edu");
     llist.push_back(mhs1);
     Mahasiswa mhs2("000001", "2101115", "Do Kyungsoo", "laki-laki", "SM", "FROZEN", "ICE", "Kyungsoo@upi.edu");
     llist.push_back(mhs2);
     Mahasiswa mhs3("000002", "2101116", "Suho", "laki", "SM", "KEKAYAAN", "MANAJEMEN_DUIT", "SUHOLKAY@upi.edu");
     llist.push_back(mhs3);
     // menampilkan data
     for (auto i = llist.begin(); i != llist.end(); i++)
     {
          cout << "NIK :"
               << " " << (*i).getNIK() << endl;
          cout << "NIM :"
               << " " << (*i).getNIM() << endl;
          cout << "Nama :"
               << " " << (*i).getNama() << endl;
          cout << "Jenis_kelamin :"
               << " " << (*i).getJenis_kelamin() << endl;
          cout << "Fakultas :"
               << " " << (*i).getFakultas() << endl;
          cout << "Prodi :"
               << " " << (*i).getProdi() << endl;
          cout << "Asal_Universitas :"
               << " " << (*i).getAsal_Universitas() << endl;
          cout << "Email_edu :"
               << " " << (*i).getEmail_edu() << endl;
          cout << endl;
     }
};