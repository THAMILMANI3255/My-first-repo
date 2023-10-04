<!DOCTYPE html>
<html lang="en">
<head>
    <title>Connect Mysql DataBase</title>
</head>
<body>
    <?php
    ob_start();
    session_start();
    $link= mysqli_connect("localhost","root","","tbl_student") or die("Cannot Connect Mysql database");
    echo "connected Successfully...";
    
    $sql="insert into bca values('21uca049','thamilmani',93)".$link;
    if($link->query($sql)===true){
        echo "New Record Created Successfully";
    }
    else{
        echo "error in insert in table "; 
    }
    ?>
</body>
</html>