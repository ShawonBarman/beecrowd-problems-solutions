<?php

    $value = readline();
    if (($value >= 0) and ($value <= 25.0000)){
        echo "Intervalo [0,25]\n";
    }
    elseif (($value >= 25.00001) and ($value <= 50.0000000)){
        echo "Intervalo (25,50]\n";
    }
    elseif (($value >= 50.00000001) and ($value <= 75.0000000)){
        echo "Intervalo (50,75]\n";
    }
    elseif (($value >= 75.00000001) and ($value <= 100.0000000)){
        echo "Intervalo (75,100]\n";
    }
    else{
        echo "Fora de intervalo\n";
    }

?>