<?php include "db.php";

function create()
{
    if(isset($_POST['signup']))
    {
        global $connection;
        $username = $_POST['username'];
        $password = $_POST['password'];
        $email = $_POST['email'];
        $contactno = $_POST['contactno'];
        $query = "INSERT INTO signup(username, email, contactno, password)VALUES ('$username','$email',$contactno,'$password')";
        $result = mysqli_query($connection, $query);
        
        if(!$result)
        {
            die("QUERY FAILED " . mysqli_error($connection));
        }
    }
}

function showAll()
{
    global $connection;
    $query = "SELECT * FROM signup";
    $result = mysqli_query($connection,$query);
    if(!$result)
    {
        die("QUERY FAILED");
    }
    while($row = mysqli_fetch_assoc($result))
    {
        print_r($row);
    }
}
?>