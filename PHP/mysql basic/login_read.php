<?php

    
    $connection = mysqli_connect('localhost','root','','loginapp');
    
    if($connection)
    {    echo "We are conneted";    }
    else
    {   die("Connection failure");  }
    
    $query = "SELECT * FROM users";
   
    $result = mysqli_query($connection , $query);
    
    if(!$result)
    {
        die("Not Connected" . mysqli_error());
    }
    


?>

<!DOCTYPE html>
<html lang='en'>
    <head>
        <meta chatset='UTF-8'>
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
       <div class="container">
          
           <div class="col-xs-6">
          
            <?php   
               while($row = mysqli_fetch_assoc($result))    {
            ?>
            <pre>
                <?php 
                    
                   print_r($row);
               
                ?> 
            </pre>
              
              <?php
              }
               
               ?>
               
           </div>
       </div>
        
    </body>
</html>