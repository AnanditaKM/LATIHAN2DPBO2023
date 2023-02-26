<?php
include "SivitasAkademik.php";
class Mahasiswa extends SivitasAkademik {
// private atribut

private $NIM = "";
private $prodi = "";
private $fakultas= "";
function __construct($NIM="",$prodi="",$fakultas="") { // CONSTRUCTOR

$this->NIM = $NIM;
$this->prodi = $prodi;
$this->fakultas = $fakultas;
}
 # Getter and Setter

function setNIM ($NIM="") {
    $this->NIM = $NIM;
}
function setprodi ($prodi="")  {
    $this->prodi= $prodi;
     
}
    function setfakultas($fakultas="") {
        $this->fakultas= $fakultas;
    }



    function getNIM() {
    
    return $this->NIM;
    }
    function getprodi () {
        return $this->prodi;
        }
    function getfakultas() {
        
        return $this->fakultas;
        }   
    
}
?>