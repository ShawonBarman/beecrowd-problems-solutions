<?php

    list($A, $B, $C) = explode(" ", readline());
    $A = (float)$A;
    $B = (float)$B;
    $C = (float)$C;
    if ((($A + $B) > $C) && (($A + $C) > $B) && (($B + $C) > $A)){
        $perimetro = $A + $B + $C;
        $perimetro = number_format($perimetro, 1, ".", "");
        echo "Perimetro = {$perimetro}\n";
    }
    else{
        $area = (1/2) * ($A + $B) * $C;
        $area = number_format($area, 1, ".", "");
        echo "Area = {$area}\n";
    }

?>