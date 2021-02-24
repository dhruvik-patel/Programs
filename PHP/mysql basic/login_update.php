<?php include "db.php";
    
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
            <form action="login_update.php" method="post">
                  
                   <div class="form-group">
                   <label for="username">Username</label>
                    <input type="text" class="form-control" name="username">
                   </div>
                  
                   <div class="form-group">
                   <label for="password">Password</label>
                    <input type="password" class="form-control" name="password">
                   </div> 
                   
                   
                   <div class="form-group">
                       <select name="id" id="">
                        <?php
                           while($row = mysqli_fetch_assoc($result))  {
                                $id = $row['Id'];
                               
                                echo "<option value='$id'>$id</option>";
                                    
                           }
                        ?>
                       </select>
                   </div>
                   
                   <input class="btn btn-primary" type="submit" name="" value="Update">
                   
                   
               </form>

               
           </div>
       </div>
        
    </body>
</html>