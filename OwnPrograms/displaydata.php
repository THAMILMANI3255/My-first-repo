<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display DB Values</title>
</head>
<body>
    <?php
    $conn=mysqli_connect('localhost','root','','std_info');
    $rs=mysqli_query($conn,"select * from info");
    if(mysqli_num_rows($rs))    //It Is Return No.Of.Rows To Be Available...
    {
    ?>
    <table border="1" cellspacing="1" cellpadding="3" width="400">
        <?php
        while($arr=mysqli_fetch_array($rs)) //It Is Used To Create An Array Then Insert Values From DB to The Array
        {
        ?>
        <tr>
            <td><?php echo $arr[0] ?></td>
            <td><?php echo $arr[1] ?></td>
        </tr>
        <?php
        }
        ?>
    </table>
    <?php
    }
    ?>
</body>
</html>