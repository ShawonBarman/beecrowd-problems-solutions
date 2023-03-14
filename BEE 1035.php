<?php

    list($A, $B, $C, $D) = explode(" ", readline());
    $A = (int) $A;
    $B = (int) $B;
    $C = (int) $C;
    $D = (int) $D;
    if (($B > $C) and ($D > $A) and (($C + $D) > ($A + $B)) and ($C > 0) and ($D > 0) and ($A % 2 == 0))
    {
        echo "Valores aceitos\n";
    }
    else{
        echo "Valores nao aceitos\n";
    }

?>