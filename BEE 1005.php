<?php

    $a = readline();
    $b = readline();
    $media = (($a * 3.5) + ($b * 7.5))/(3.5 + 7.5);
    $media = number_format($media, 5, ".", "");
    echo "MEDIA = $media\n";

?>