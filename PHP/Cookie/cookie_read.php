<?php 

    $name = "Cookie1";
    $value = 100;
    $expiration = time() + (3*60*60);
    setcookie($name , $value , $expiration);

?>

<!DOCTYPE html>
<html lang='en'>
    <head>
        <meta chatset='UTF-8'>
        <title></title>
    </head>
    <body>
    <?php 

    if(isset($_COOKIE['Cookie1']))
    {
        $name = $_COOKIE['Cookie1'];
        echo $name;
    }

    ?>        
    </body>
</html>