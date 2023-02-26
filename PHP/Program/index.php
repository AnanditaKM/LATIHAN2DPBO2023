
<?php

include "Mahasiswa.php";


$input = array();

$mhs1 = new Mahasiswa();
$mhs1->setNIK("000000");
$mhs1->setNIM("2101114");
$mhs1->setnama("Anandita ");
$mhs1->setjenis_kelamin("perempuan");
$mhs1->setasal_Univ("UPI");
$mhs1->setfakultas("FPMIPA");
$mhs1->setprodi("Ilmu Komputer");
$mhs1->setemail_edu("Ananditakusumah@upi.edu");
array_push($input,$mhs1);


$mhs2 = new Mahasiswa();
$mhs2->setNIK("000001");
$mhs2->setNIM("2101115");
$mhs2->setnama("Do Kyungsoo ");
$mhs2->setjenis_kelamin("cwk");
$mhs2->setasal_Univ("SM");
$mhs2->setfakultas("FROZEN");
$mhs2->setprodi("ICE");
$mhs2->setemail_edu("Kyungsoo@upi.edu");
array_push($input,$mhs2);


$mhs3 = new Mahasiswa();
$mhs3->setNIK("000002");
$mhs3->setNIM("2101116");
$mhs3->setnama("Suho ");
$mhs3->setjenis_kelamin("laki");
$mhs3->setasal_Univ("SM");
$mhs3->setfakultas("KEKAYAAN");
$mhs3->setprodi("Ilmu MANAJEMEN_DUIT");
$mhs3->setemail_edu("SUHOLKAY@upi.edu");
array_push($input,$mhs3);

foreach ($input as $mhs)
{
    echo "NIK :" . $mhs->getNIK() . "<br>";
    echo "NIM :" . $mhs->getNIM() . "<br>";
    echo "Nama : "  .  $mhs->getnama() . "<br>";
    echo "Jenis Kelamin : " . $mhs->getjenis_kelamin() . "<br>";
    echo "Asal Universitas : "  .  $mhs->getasal_Univ() . "<br>";
    echo "Fakultas : "  .  $mhs->getfakultas() . "<br>";
    echo "Program Studi : "  .  $mhs->getprodi() . "<br>";
    echo "Email Edu : "  .  $mhs->getemail_edu() . "<br>";
    echo"<hr>";
}


?>