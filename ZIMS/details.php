<html>
 <head>
 	<title>
 		Details of Students
 	</title>
 </head>

 <body>
 	<?php 

 	$server = "127.0.0.1:3306";
 	$uname = "sandy";
 	$password = "student";
 	$dbname = "library";


 	$con = new mysqli($server,$uname,$password,$dbname);

 	$name = $_POST["uid"];
 	$pass = $_POST["pwd"];


 	if($con->connect_error)
 	{
 		die("Connnection failed".$con->connect_error);
 	}
 	echo "Conneccted successfully"."<br>";


 	$sql = "select * from login where unmae ='$name' and passwd='$pass';";
 	$result = $con->query($sql);

 	?>	

 	<table>
 		<tr>
 			<th>Name</th>
 			<th>Reg No</th>
 			<th>Department</th>
 			<th>Book</th>
 		</tr>

 	<?php 
 	while($row = $result->fetch_assoc())
 	{
 	?>


 		<tr>
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
 	} ?>
 	</table>
 </body>
 <?php $con->close();
 ?>
</html>