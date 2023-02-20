/*Saya Anandita K NIM 2101114 mengerjakan soal Latihan 2 dalam mata kulia
h Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
class Human{
    private String NIK;
    private String nama;
    private String jenis_kelamin;
    Human(){
       
      }
      //setter and getter
    public String getNIK(){
        return this.NIK;
    }
       public String getNama(){
        return this.nama;
    } 
        public String getJenkal(){
        return this.jenis_kelamin;
    }
     public void setNIK(String NIK){
         this.NIK=NIK;
    }
       public void setNama(String nama){
         this.nama=nama;
    } 
        public void setJenkal(String jenis_kelamin){
         this.jenis_kelamin=jenis_kelamin;
    }

}
