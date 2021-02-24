<?php include "db.php";

function createRows()
{
    if(isset($_POST['Submit']))
    {   global $connection;
        $username = $_POST['username'];
        $password = $_POST['password'];
//        $connection = mysqli_connect('localhost','root','','loginapp');
     
        $username = mysqli_real_escape_string($connection,$username);
        $password = mysqli_real_escape_string($connection,$password);
        
        $hashFormat = "$2y$10$";
        $salt = "thisis22charactersyeah";
        $hash = $hashFormat . $salt;
        $password = crypt($password,$hash);
     
//        if(!$connection)
//        {   die("Connection failure");  }
//    
        $query = "INSERT INTO users(username, password)";
        $query .= "VALUES ('$username' , '$password')";
        $result = mysqli_query($connection , $query);
    
        if(!$result)
        {
            die("Not Connected" . mysqli_error());
        }
    }
}

function readRows()
{
    global $connection;
    $query = "SELECT * FROM users";
    $result = mysqli_query($connection , $query);
    if(!$result)
    {    die("Not Connected" . mysqli_error());  }
    
    while($row = mysqli_fetch_assoc($result)) 
    {
        print_r($row);   
    }
    
}

function showAllData()
{
    global $connection;
    $query = "SELECT * FROM users";
    $result = mysqli_query($connection , $query);
    
    if(!$result)
    {   die("Not Connected" . mysqli_error());  }
     
    while($row = mysqli_fetch_assoc($result))  {
                $id = $row['Id'];                               
                echo "<option value='$id'>$id</option>";
    
        }
}


function update()
{
    if(isset($_POST['submit']))
    {
        $username = $_POST['username'];
        $password = $_POST['password'];
        $id = $_POST['Id'];
        global $connection;
        $query = "UPDATE users SET username = '$username',password = '$password' WHERE Id = $id";
        
        $result = mysqli_query($connection, $query);
        
        if(!$result)
        {
            die("QUERY FAILED " . mysqli_error($connection));
        }
    }
}

function deleteRows()
{
    global $connection;
    if(isset($_POST['submit']))
    {
        $id = $_POST['Id'];
        global $connection;
    
        $query = "DELETE FROM users WHERE Id = $id";    
        $result = mysqli_query($connection, $query);
        
        if(!$result)
        {
            die("QUERY FAILED " . mysqli_error($connection));
        }
    }
}
?>