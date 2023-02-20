/*Saya Anandita K NIM 2101114 mengerjakan soal Latihan 2 dalam mata kulia
h Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
class SivitasAkademik extends Human{
    private String asal_universitas;
    private String email_edu;
    SivitasAkademik(){
       
    }
    //setter and getter
    public String getAsalUniversitas(){
        return this.asal_universitas;
    }

    public String getEmailEdu(){
        return this.email_edu;
    }

    public void setAsalUniversitas(String asal_universitas){
        this.asal_universitas = asal_universitas;
    }

    public void setEmailEdu(String email_edu){
        this.email_edu = email_edu;
    }
}
