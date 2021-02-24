<?php

class Shape
{
    public $length = 10;
    public $width = 5;
    public $radious = 6;
    
    function __construct()
    {       echo "I am Shape..." . "<br>";       }
}


class Rectangle extends Shape
{
    function __construct()  {   echo "I am Recatangle<br>"; }
    function area()
    {       echo ($this->length * $this->width) . "<br>";        }
    function peri()
    {       echo 2*($this->length + $this->width) . "<br>";      }
}


class Circle extends Shape
{
    function __construct()  {   echo "I am Circle<br>"; }
    function area()
    {       echo (3.14*$this->radious*$this->radious) . "<br>";      }
    function peri()
    {       echo (2*3.14*$this->radious) . "<br>";     }
}

$shap = new Shape();
$rect = new Rectangle();
$circ = new Circle();

echo "Area Of Rectangle And Circle : ";
$rect->area();
$circ->area();
echo "Perimeter Of Rectangle And Circle : ";
$rect->peri();
$circ->peri();

?>