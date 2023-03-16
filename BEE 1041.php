<?php

    list($x, $y) = explode(" ", readline());
    $x = (float) $x;
    $y = (float) $y;
    if (($x == 0) and ($y == 0)){
        echo "Origem\n";
    }
    elseif (($x != 0) and ($y == 0)){
        echo "Eixo X\n";
    }
    elseif (($x == 0) and ($y != 0)){
        echo "Eixo Y\n";
    }
    elseif ($x > 0 and $y > 0){
        echo "Q1\n";
    }
    elseif ($x > 0 and $y < 0){
        echo "Q4\n";
    }
    elseif ($x < 0 and $y > 0){
        echo "Q2\n";
    }
    else{
        echo "Q3\n";
    }

?>