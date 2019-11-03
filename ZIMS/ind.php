<!DOCTYPE html>
<html>
<head>
<title>PDO </title>
</head>
<body>

<h3>DataBase Connection in PHP</h3>

<?php
$srvr_name="127.0.0.1";
$usr_name="san";
$pass_wd="student";
$db_name="student";

try
{
 $c = new PDO("mysql:host=$srvr_name;dbname=$db_name",$usr_name,$pass_wd);
 $c->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
 $sql="DROP TABLE student;";
 $c->exec($sql);
 $sql="CREATE table student(
 RegNo int auto_increment primary key,
 FirstName varchar(30) not null,
 LastName varchar(30) not null,
 Email_ID varchar(30) not null);";
 $c->exec($sql);
 echo "Table Created<br>";
}
catch(PDOException $e)
{
 echo $e->getMessage();
}
$c=null;
?>

</body>
</html> 
