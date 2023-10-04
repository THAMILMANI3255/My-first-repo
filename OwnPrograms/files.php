<!DOCTYPE html>
<html lang="en">
<head>
    <title>File Demo</title>
</head>
<body>
    <?php
    if(!isset($_GET['mode'])){
    ?>
    <form name="frmfile" method="post" action="files.php?mode=write">
        <label>Type Here : </label>
        <textarea name="txa">
        </textarea><br>
        <input type="submit" name="write" value="Write">
    </form>
    <?php
    }
    if(isset($_GET['mode'])){
        $mode = $_GET['mode'];
        if($mode == 'write'){
            $file=fopen("hai.txt","w");
            $value=$_POST["txa"];
            echo "Written Successfully";
            fputs($file,$value);
    ?>
    <form name="frmread" method="post" action="files.php?mode=read">
        <input type="submit" name="read" value="Read">
    </form>
    <?php
        }
        elseif ($mode=='read') {
            $file = fopen("hai.txt","r");
            $filevalue = fread($file,10000);
            echo "$filevalue";
            echo " ";
        }
    }
    ?>
</body>
</html>