<html>
<head>
<title>
LOGIN
</title>

<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>

</head>
<body>
<h3 style="text-align:center;font-family:Gothic;font-size:300%">LOG IN</h3>
<div>
  <form action="details.php" method="post">
    
  	<label for="uname">User Name</label>
    <input type="text" id="uname" name="uid" placeholder="Your user name...">

    <label for="pass">Password</label>
    <input type="text" id="pass" name="pwd" placeholder="Your password...">
	<input type="submit" value="Submit">
  </form>
</div>
</body>

</html>
