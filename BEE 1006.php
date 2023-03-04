<?php

    $a = readline();
    $b = readline();
    $c = readline();
    $media = (($a * 2) + ($b * 3) + ($c * 5))/(2 + 3 + 5);
    $media = number_format($media, 1, ".", "");
    echo "MEDIA = $media\n";

?>