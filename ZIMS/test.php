<?php 
$uname='san';
$sname='127.0.0.1';
$passwd='student';
$dbname='employee';


$c = new mysqli($sname,$uname,$passwd,$dbname);

if($c->connect_error)
{
 echo "connection failed";
}
else
{
 echo "Connection established";
}

$q='select * from employee';
$r=$c->query($q);
while($row=$r->fetch_row())
{
 echo $row[0]."  ".$row[1]."  ".$row[2]."<br>";
}

?>
