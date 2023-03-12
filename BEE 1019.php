<?php

    $N = readline();
    $hour = (int) ($N / 3600);
    $N = $N % 3600;
    $minute = (int) ($N / 60);
    $N = $N % 60;
    echo "$hour:$minute:$N\n";

?>