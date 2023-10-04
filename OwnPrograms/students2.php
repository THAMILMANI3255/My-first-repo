<?php
$conn=mysqli_connect('localhost','root','');
mysqli_select_db($conn,"std_info")or die("cannot connect Mysqli");
if(isset($_REQUEST["mode"])=="save")
{
    mysqli_query($conn,"insert into info values('".$_POST[reg]."','".$_POST[name]."')");
    
    if(mysql_affected_rows($conn))
    {
        $_SESSION['msg']="saved successfully";
    }
    header("location:students2.php");
    die();
}
else
{
?>
<html>
<head><title>Info</title></head>
<body>
    <form name="frm" action="students2.php?mode=save" method="post">
        <table cellspacing="1" cellpadding="1" border="1">
            <tr>
                <td>Register Number : </td>
                <td><input type="text" name="reg"></td>
            </tr>
            <tr>
                <td>Name : </td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
                <td><input type="reset" value="Clear"></td>
            </tr>
        </table>
        <?php
        if(isset($_SESSION['msg']))
        {
            if($_SESSION['msg']!=" ")
            echo $_SESSION['msg'];
            $_SESSION['msg']=" ";
        }
        ?>
    </form>
</body>
</html>
<?php
}
?>