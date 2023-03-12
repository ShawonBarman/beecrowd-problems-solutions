<?php

    $hour = readline();
    $kmPerHour = readline();
    $totalKM = $hour * $kmPerHour;
    $totalFuel = $totalKM / 12;
    $totalFuel = number_format($totalFuel, 3, ".", "");
    echo "$totalFuel\n";

?>