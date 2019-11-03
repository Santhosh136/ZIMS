<html>
<head>
<title>
Names
</title>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>

<body>
<?php

$sname="127.0.0.1:3306";
$uname="sandy";
$passwd="student";
$dbname="library";

$con=new mysqli($sname,$uname,$passwd,$dbname);

$name=$_POST["uid"];
$pass=$_POST["pwd"];


if($con->connect_error)
{
 die("Connection failed:".$con->connect_error);
}
echo "Connected Successfully"."<br>";

/*$r=$_POST["num"];
$name=$_POST["f"];
$lname=$_POST["l"];
$mail=$_POST["e"];
$sql = "insert into student values($r,'$name','$lname','$mail')";
$con->query($sql);

if ($con->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    //echo "Error: " . $sql . "<br>" . $con->error;
}
*/

$sql="select * from login where uname='$name' and passwd='$pass';";
$result = $con->query($sql);
?>
<h3 style="color:Green;text-align:center;font-family:Gothic;font-size:300%;background-color:LawnGreen">TABLE VIEW</h3>
<table id="customers">
  <tr>
    <th>Name</th>
    <th>RegNo</th>
    <th>Department</th>
    <th>Book Name</th>
    <th>Author Name</th>
    <th>Acc No</th>
    <th>Gender</th>
    <th>Mobile No</th>
  </tr>
<?php
$i=0;
while($row = $result->fetch_assoc())
{
  
  ?><tr>
    <td><?php echo $row["name"]?></td>
    <td><?php echo $row["regno"]?></td>
    <td><?php echo $row["dept"]?></td>
    <td><?php echo $row["book"]?></td>
    <td><?php echo $row["author"]?></td>
    <td><?php echo $row["accno"]?></td>
    <td><?php echo $row["gender"]?></td>
    <td><?php echo $row["mobno"]?></td>
  </tr>
  <?php
  $i=$i+1;
}
?>
</table>

</body>
<?php
$con->close();
?>
</html>

