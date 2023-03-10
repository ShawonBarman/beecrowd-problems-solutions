<?php

    $pi = 3.14159;
    $R = readline();

    $volume = (4/3) * $pi * pow($R, 3);
    $volume = number_format($volume, 3, ".", "");

    echo "VOLUME = $volume\n";

?>