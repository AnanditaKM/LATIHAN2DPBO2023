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