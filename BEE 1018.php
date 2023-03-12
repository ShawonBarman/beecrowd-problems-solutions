<?php

    $N = readline();
    echo "$N\n";

    $value = (int) ($N / 100);
    echo "$value nota(s) de R$ 100,00\n";
    $N = $N % 100;

    $value = (int) ($N / 50);
    echo "$value nota(s) de R$ 50,00\n";
    $N = $N % 50;

    $value = (int) ($N / 20);
    echo "$value nota(s) de R$ 20,00\n";
    $N = $N % 20;

    $value = (int) ($N / 10);
    echo "$value nota(s) de R$ 10,00\n";
    $N = $N % 10;

    $value = (int) ($N / 5);
    echo "$value nota(s) de R$ 5,00\n";
    $N = $N % 5;

    $value = (int) ($N / 2);
    echo "$value nota(s) de R$ 2,00\n";
    $N = $N % 2;

    $value = (int) ($N / 1);
    echo "$value nota(s) de R$ 1,00\n";

?>