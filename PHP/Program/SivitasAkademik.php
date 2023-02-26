<?php
include "Human.php";
class SivitasAkademik extends Human{
// private atribut

private $asal_Univ = "";
private $email_edu = "";

function __construct($asal_Univ="",$email_edu="",) { // CONSTRUCTOR

$this->asal_Univ = $asal_Univ;
$this->email_edu = $email_edu;

}
 # Getter and Setter

function setasal_Univ ($asal_Univ="") {
    $this->asal_Univ = $asal_Univ;
}
function setemail_edu ($email_edu="")  {
    $this->email_edu= $email_edu;
     
}


    function getasal_Univ() {
    
    return $this->asal_Univ;
    }
    function getemail_edu () {
        return $this->email_edu;
        }

}
?>