<!DOCTYPE html>
<html lang='en'>
    <head>
        <meta chatset='UTF-8'>
        <title>Form</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
   
    </head>
    <body>
       <div class="container">
       
       <div class="col-xs-6">
       
        <form action="externel_ref.php" method="post">
          
            <div class="form-group">
            <label for="username">Username</label>
            <input type="text" name="username" class="form-control" placeholder="Type Username">    
            </div>
            
            <div class="form-group">
            <label for="password">Password</label>
            <input type="password" placeholder="Type Password" class="form-control" name="password"> 
            </div>
            
            <input class="btn btn-primary" type="submit" name="submit" value="Submit">
        
        </form>
        
        </div>
        
        </div>
    </body>
</html>