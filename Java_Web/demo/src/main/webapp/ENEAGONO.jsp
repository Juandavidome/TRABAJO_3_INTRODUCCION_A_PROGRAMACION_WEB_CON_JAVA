<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ENEAGONO</title>
    <link rel="shortcut icon" href="./assets/Imagenes/pngwing.com.png" type="image/x-icon">
    <link rel="stylesheet" href="./assets/css/Style2.css">
</head>
<body>
    <header class="header">
        <label for="" class="image">
            <a href=""><img src="./assets/Imagenes/pngwing.com.png" alt=""></a>
        </label>
        <label for="" class="image2">
            <a href=""><img src="./assets/Imagenes/kindpng_4308009.png" alt=""></a>
        </label>
        <label for="" class="image3">
            <a href=""><img src="./assets/Imagenes/Lovepik_com-401159472-colorful-geometric-figure.png" alt=""></a>
        </label>
    </header>
        <!--SECCION DE PAGINA-->
        <nav class="Navegacion">
            <!--DEFINICION DE LISTA-->
            <ul class="Menu" align="center">
                <!--DEFINICION DE ELEMENTOS DE LA LISTA-->
                <li><a href="./index.jsp"><b>INICIO</b></a></li>
            <li><a href="#"><b>FIGURAS GEOMETRICAS</b></a>
                    <!--DEFINICION DE LISTA-->
                    <ul class="submenu2">
                    <!--DEFINICION DE ELEMENTOS DE LA LISTA-->
                    <li><a href="./DELTOIDE.jsp"><b>DELTOIDE</b></a></li>
                    <li><a href="./ENEAGONO.jsp"><b>ENEAGONO</b></a></li>
                    <li><a href="./ROMBOIDE.jsp"><b>ROMBOIDE</b></a></li>
                    </ul>
                    </li>
            </ul>
        </nav>
        <div class="container"align="center">
        <main>
            <a href=""><img class="imagenes" src="./assets/Imagenes/1200px-09-L_Eneágono.svg.png" alt=""></a>       
            <h1>PERIMETRO Y AREA DE UN ENEAGONO</h1>
            <br>
            <hr>
            <br>
             <form>
                <label for="nombre">INGRESE EL VALOR LOS LADOS DEL ENEAGONO:</label>
                <input class="controls"type="text" placeholder="Ingrese el valor"name="nombre" id="nombre">
                <br>
                <input class="botons"type="button" value="Ingresar"> 
                <br>
                <label>EL PERIMETRO DEL ENEAGONO ES:</label>
                <input  class="controls"type="text" placeholder="ValorPerimetro" name="valor">
                <br>
                <label>EL AREA DEL ENEAGONO ES:</label>
                <input class="controls" type="text" placeholder="ValorArea" name="valor2">
             </form>
        </main>
        </div>
</body>
</html>