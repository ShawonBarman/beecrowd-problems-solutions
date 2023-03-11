<?php

    list($a, $b, $c) = explode(" ", readline());
    $a = (int)$a;
    $b = (int)$b;
    $c = (int)$c;

    $maiorAB = ($a + $b + abs($a - $b))/2;
    $maiorBC = ($b + $c + abs($b - $c))/2;
    $maiorAC = ($a + $c + abs($a - $c))/2;

    if (($maiorAB > $maiorBC) && ($maiorAB > $maiorAC)){
        echo "$maiorAB eh o maior\n";
    }
    elseif ($maiorBC > $maiorAC){
        echo "$maiorBC eh o maior\n";
    }
    else{
        echo "$maiorAC eh o maior\n";
    }

?>