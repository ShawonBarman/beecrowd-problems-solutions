<?php

    list($A, $B) = explode(" ", readline());
    $A = (int)$A;
    $B = (int)$B;
    if ((($A % $B) == 0) || (($B % $A) == 0)){
        echo "Sao Multiplos\n";
    }
    else{
        echo "Nao sao Multiplos\n";
    }

?>