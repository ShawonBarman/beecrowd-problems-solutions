<?php

    list($A, $B, $C) = explode(" ", readline());
    $A = (float)$A;
    $B = (float)$B;
    $C = (float)$C;
    $pi = 3.14159;

    $triangle = (1/2) * $A * $C;
    $triangle = number_format($triangle, 3, ".", "");
    echo "TRIANGULO: $triangle\n";

    $radius_circle = $pi * pow($C, 2);
    $radius_circle = number_format($radius_circle, 3, ".", "");
    echo "CIRCULO: $radius_circle\n";

    $trapezium = (1/2) * ($A + $B) * $C;
    $trapezium = number_format($trapezium, 3, ".", "");
    echo "TRAPEZIO: $trapezium\n";

    $square = pow($B, 2);
    $square = number_format($square, 3, ".", "");
    echo "QUADRADO: $square\n";

    $rectangle = $A * $B;
    $rectangle = number_format($rectangle, 3, ".", "");
    echo "RETANGULO: $rectangle\n";


?>