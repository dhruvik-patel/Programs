<?php include "db.php";
      include "functions.php";
?>

<?php   update();   ?>
<?php   include "includes/header.php"    ?>
               <h1 class ="text-center">UPDATE</h1>
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
                       <select name="Id" id="">
                        <?php
                           showAllData();
                        ?> 
                       </select>
                   </div>
                   
                   <input class="btn btn-primary" type="submit" name="submit" value="Update">
       
               </form>
<?php   include "includes/footer.php"   ?>