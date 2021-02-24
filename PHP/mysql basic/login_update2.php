<?php include "db.php";
      include "functions.php";
?>

<?php 

    if(isset($_POST['submit']))
    {
        $username = $_POST['username'];
        $password = $_POST['password'];
        $id = $_POST['Id'];
        
        $query = "UPDATE users SET username = '$username',password = '$password' WHERE Id = $id";
        
        $result = mysqli_query($connection, $query);
        
        if(!$result)
        {
            die("QUERY FAILED " . mysqli_error($connection));
        }
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
            <form action="login_update2.php" method="post">
                  
                   <div class="form-group">
                   <label for="username">Username</label>
                    <input type="text" class="form-control" name="username">
                   </div>
                  
                   <div class="form-group">
                   <label for="password">Password</label>
                    <input type="password" class="form-control" name="password">
                   </div> 
                   
                   
                   <div class="form-group">
                       <select name="Id" id="">
                        <?php
                           showAllData();
                        ?> 
                       </select>
                   </div>
                   
                   <input class="btn btn-primary" type="submit" name="submit" value="Update">
                   
                   
               </form>

               
           </div>
       </div>
        
    </body>
</html>