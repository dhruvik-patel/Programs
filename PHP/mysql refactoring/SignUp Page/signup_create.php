<?php include "db.php"; ?>
<?php include "functions.php" ?>
<?php create(); ?>

<?php include "includes/header.php"; ?>
            <h1 class="text-center">SignUp</h1>
             <form action="signup_create.php" method="post" class="form-group">
              
               <div class="form-group">
                  <label for="username">Username</label>
                   <input type="text" name="username" class="form-control">
               </div>
               
               <div class="form-group">
                  <label for="email">Email Id</label>
                   <input type="email" name="email" class="form-control">
               </div>
               
               <div class="form-group">
                  <label for="contactno">Contact No</label>
                   <input type="number" name="contactno" class="form-control">
               </div>
               
               <div class="form-group">
                  <label for="password">Password</label>
                   <input type="password" name="password" class="form-control">
               </div>
               
               <input type="submit" name="signup" value="SignUp" class="btn btn-primary">
               
               </form>
<?php include "includes/footer.php" ?>