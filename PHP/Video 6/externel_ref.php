<?php 

if(isset($_POST['submit']))
{
    $username = $_POST['username'];
    $password = $_POST['password'];
    
    $name = array('Dhruvik','Nirlep','Jaydip');
    if(strlen($username) < 5)
        echo "username must be more than 5 characters...";
    if(strlen($username) > 20)
        echo "username must be less than 20 characters...";
    if(in_array($username,$name))
        echo "You are allowed";
    else
        echo "You are not allowed";
}
?>