<?php 
    $connection = mysqli_connect('localhost','root','','loginapp');
    if(!$connection)
    {
        die("Connection Failed : " . mysqli_error($connection));
    }

?>