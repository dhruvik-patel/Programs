<?php include "db.php";
    include "functions.php"; ?>

<?php
    createRows();
?>
<?php include "includes/header.php" ?>

              <h1 class = "text-center">CREATE</h1>
               <form action="login_create.php" method="post">
                  
                   <div class="form-group">
                   <label for="username">Username</label>
                    <input type="text" class="form-control" name="username">
                   </div>
                  
                   <div class="form-group">
                   <label for="password">Password</label>
                    <input type="password" class="form-control" name="password">
                   </div> 
                   
                   <input class="btn btn-primary" type="submit" name="Submit" value="CREATE">
                   
               </form>
<?php include "includes/footer.php" ?>