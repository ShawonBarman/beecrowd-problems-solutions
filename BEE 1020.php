<?php

    $days = readline();
    $year = (int) ($days / 365);
    $days = $days % 365;
    $month = (int) ($days / 30);
    $day = $days % 30;
    echo "$year ano(s)\n";
    echo "$month mes(es)\n";
    echo "$day dia(s)\n";

?>