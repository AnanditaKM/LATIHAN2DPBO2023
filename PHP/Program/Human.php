<?php

class Human{
// private atribut

private $NIK = "";
private $nama = "";
private $jenis_kelamin= "";

function __construct($NIK="",$nama="",$jenis_kelamin="",) { // CONSTRUCTOR

$this->NIK = $NIK;
$this->nama = $nama;
$this->jenis_kelamin = $jenis_kelamin;

}
 # Getter and Setter

function setNIK ($NIK="") {
    $this->NIK = $NIK;
}
function setnama ($nama="")  {
    $this->nama= $nama;
     
}
    function setjenis_kelamin($jenis_kelamin="") {
        $this->jenis_kelamin= $jenis_kelamin;
    }

  

    function getNIK() {
    
    return $this->NIK;
    }
    function getnama () {
        return $this->nama;
        }
    function getjenis_kelamin() {
        
        return $this->jenis_kelamin;
        }

}
?>