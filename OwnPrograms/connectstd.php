<?php
$conn=mysqli_connect('localhost','root','','tbl_student');
if(!$conn){
    die('Connection Error'.mysqli_connect_error());
}
else{
    echo "connection Successfully Done By Mani";
}

$sql = "INSERT INTO bca (Reg_no,Name,Mark)
VALUES ('21uca024','Kumaravel',87)";

if ($conn->query($sql) === TRUE) {
echo "New record created successfully";
} else {
echo "Error: " . $sql . "<br>" . $conn->error;
}$conn->close();
?>