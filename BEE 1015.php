<?php

    list($x1, $y1) = explode(" ", readline());
    list($x2, $y2) = explode(" ", readline());
    $x1 = (float) $x1;
    $y1 = (float) $y1;
    $x2 = (float) $x2;
    $y2 = (float) $y2;
    $distance = sqrt(pow($x2 -$x1, 2) + pow($y2 - $y1, 2));
    $distance = number_format($distance, 4, ".", "");
    echo "$distance\n";

?>