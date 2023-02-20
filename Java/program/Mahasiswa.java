class Mahasiswa extends SivitasAkademik {
      // private atribut untuk kelas Mahasiswa
    private String NIM;
    private String fakultas;
    private String prodi;
  

    Mahasiswa(String NIK, String NIM, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,
   String email_edu) 
    {
        // set atribut dari Mahasiswa
        this.setNIK(NIK);
        this.setNama(nama);
        this.setJenkal(jenis_kelamin);

        // set atribut dari SivitasAkademik
        this.setAsalUniversitas(asal_universitas);
        this.setEmailEdu(email_edu);

        // set atribut dari Mahasiswa
        this.NIM = NIM;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    public void setNIM(String b) // method UNTUK SET NIM
    {
        this.NIM = b;
    }
    public void setProdi(String c) // method UNTUK SET PRODI
    {
        this.prodi = c;
    }
    public void setFakultas(String d)// method UNTUK SET FAKULTAS
    {
        this.fakultas = d;
    }
    public String getNIM() {//method untuk getnim
        return NIM;
    }
    public String getFakultas() {//method untuk get fakultas
        return fakultas;
    }

    public String getProdi() {//method untuk get prodi
        return prodi;
    } 
}