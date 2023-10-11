<?php
$conn=mysqli_connect('localhost','root','');
mysqli_select_db($conn,"std_info")or die("cannot connect Mysqli");
if(isset($_REQUEST["mode"])=="save")
{
    mysqli_query($conn,"insert into info values('".$_POST[reg]."','".$_POST[name]."')");
    
    if(mysqli_affected_rows($conn))
    {
        $_SESSION['msg']="saved successfully";
    }
    header("location:products.php");
    die();
}
else
{
?>
<html>
<head>
    <title>Products</title>
    <script language="javascript">
        function valid()
        {
            var a=0;
            if(!a.test(document.frm.reg.value))
            {
                alert("Enter The Product Id : ");
                document.frm.reg.value="";
                document.frm.reg.focus();
                return false;
            }
        }
    </script>
</head>
<body>
    <form name="frm" action="products.php?mode=save" method="post" onsubmit="return valid()">
        <table cellspacing="1" cellpadding="1" border="1">
            <tr height="40">
                <td>Register Number : </td>
                <td><input type="text" name="reg"></td>
            </tr>
            <tr height="40">
                <td>Name : </td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr height="40">
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