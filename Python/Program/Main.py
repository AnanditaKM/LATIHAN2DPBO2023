# Saya Anandita K NIM 2101114 mengerjakan soal Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. 
from Mahasiswa import Mahasiswa
# mengisi data list
llist = []
mhs1 = Mahasiswa()
mhs1.set_NIK("00000")
mhs1.set_NIM("2101114")
mhs1.set_Nama("anandita")
mhs1.set_Jenis_kelamin("perempuan")
mhs1.set_asal_universitas("UPI")
mhs1.set_fakultas("FPMIPS")
mhs1.set_prodi("ILKOM")
mhs1.set_email_edu("anandita@UPI.EDU")
llist.append(mhs1)

mhs2 = Mahasiswa()
mhs2.set_NIK("00001")
mhs2.set_NIM("2101115")
mhs2.set_Nama("Do Kyungsoo")
mhs2.set_Jenis_kelamin("LAKI")
mhs2.set_asal_universitas("SM")
mhs2.set_fakultas("FROZEN")
mhs2.set_prodi("ICE")
mhs2.set_email_edu("Kyungsoo@upi.edu")
llist.append(mhs2)

mhs3 = Mahasiswa()
mhs3.set_NIK("00002")
mhs3.set_NIM("2101116")
mhs3.set_Nama("Suho")
mhs3.set_Jenis_kelamin("LAKI")
mhs3.set_asal_universitas("SM")
mhs3.set_fakultas("KEKAYAAN")
mhs3.set_prodi("MANAJEMEN_DUIT")
mhs3.set_email_edu("SUHOLKAY@upi.edu")
llist.append(mhs3)
# menampilkan data
for i in llist:
    print("NIK :"+i.get_NIK())
    print("NIM :"+i.get_Nim())
    print("Nama : " + i.get_Nama())
    print("Jenis Kelamin : "+i.get_Jenis_kelamin())
    print("Asal Universitas : " + i.get_asal_universitas())
    print("Fakultas : " + i.get_fakultas())
    print("Program Studi : " + i.get_prodi())
    print("Email Edu : " + i.get_email_edu())
    print()
