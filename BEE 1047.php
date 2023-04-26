<?php

    list($initial_hour, $initial_minute, $final_hour, $final_minute) = explode(" ", readline());
    
    $total_minute = 0;
    $total_hour = 0;
    
    if($initial_hour == $final_hour){
        if ($initial_minute == $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = (24 - $initial_hour) + $final_hour;
        }
        elseif ($initial_minute < $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = $final_hour - $initial_hour;
        }
        else{
            $total_minute = (60 - $initial_minute) + $final_minute;
            $total_hour = (24 - $initial_hour) + $final_hour - 1;
        }
    }
    elseif($initial_hour < $final_hour){
        if ($initial_minute == $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = $final_hour - $initial_hour;
        }
        elseif ($initial_minute < $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = $final_hour - $initial_hour;
        }
        else{
            $total_minute = (60 - $initial_minute) + $final_minute;
            $total_hour = $final_hour - $initial_hour - 1;
        }
    }
    else{
        if ($initial_minute == $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = (24 - $initial_hour) + $final_hour;
        }
        elseif ($initial_minute < $final_minute){
            $total_minute = $final_minute - $initial_minute;
            $total_hour = (24 - $initial_hour) + $final_hour - 1;
        }
        else{
            $total_minute = (60 - $initial_minute) + $final_minute;
            $total_hour = (24 - $initial_hour) + $final_hour - 1;
        }
    }

    echo "O JOGO DUROU {$total_hour} HORA(S) E {$total_minute} MINUTO(S)\n";

?>