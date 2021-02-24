<?php 

    print_r($_GET);

?>


<!DOCTYPE html>
<html lang='en'>
    <head>
        <meta chatset='UTF-8'>
        <title>GET Example</title>
    </head>
    <body>
       <?php
            $id = 10;
            $button = "Click Here";
        
        ?>
        
        <a href="get.php?id=<?php echo $id?>"><?php echo $button?></a>
        
    </body>
</html>