<?php
    list($starting_time, $ending_time) = explode(" ", readline());
    if($starting_time < $ending_time){
        $ans = $ending_time - $starting_time;
        echo "O JOGO DUROU {$ans} HORA(S)\n";
    }
    else{
        $ans = (24 - $starting_time) + $ending_time;
        echo "O JOGO DUROU {$ans} HORA(S)\n";
    }
?>