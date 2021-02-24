<?php include "db.php";

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

function deleteRows()
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
?>