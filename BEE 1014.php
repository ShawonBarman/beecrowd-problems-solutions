<?php

    $X = readline();
    $Y = readline();
    $total_fuel = $X / $Y;
    $total_fuel = number_format($total_fuel, 3, ".", "");
    echo "$total_fuel km/l\n";

?>