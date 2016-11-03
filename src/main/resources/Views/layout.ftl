<#macro layout>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->

    <title>Kainos Media Library</title>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
  </head>
  <body>

<nav>
   <div class="nav-wrapper" style="background: #FFFFFF">
     <img src="http://mediaserver.dwpub.com/newsroom-logo/tb_lrg/70801/Kainos-Logo+2.png" class="brand-logo left" alt="Kainos Logo" height="75">
     <ul id="nav-mobile" class="right hide-on-med-and-down">

<form>
       <div class="input-field">
         <input id="search" type="search" required>
         <label for="search"><i class="material-icons">search</i></label>
         <i class="material-icons">close</i>
       </div>
     </form>

     </ul>
   </div>
 </nav>

    <div class="container">

      <#nested/>

    </div><!-- /.container -->
  </body>
</html>
</#macro>
