<?php

    $N = readline();
    $N = $N * 100;
    echo "NOTAS:\n";
    $value = (int) ($N / 10000);
    echo "$value nota(s) de R$ 100.00\n";
    $N = $N % 10000;

    $value = (int) ($N / 5000);
    echo "$value nota(s) de R$ 50.00\n";
    $N = $N % 5000;

    $value = (int) ($N / 2000);
    echo "$value nota(s) de R$ 20.00\n";
    $N = $N % 2000;

    $value = (int) ($N / 1000);
    echo "$value nota(s) de R$ 10.00\n";
    $N = $N % 1000;

    $value = (int) ($N / 500);
    echo "$value nota(s) de R$ 5.00\n";
    $N = $N % 500;

    $value = (int) ($N / 200);
    echo "$value nota(s) de R$ 2.00\n";
    $N = $N % 200;

    echo "MOEDAS:\n";
    $value = (int) ($N / 100);
    echo "$value moeda(s) de R$ 1.00\n";
    $N = $N % 100;

    $value = (int) ($N / 50);
    echo "$value moeda(s) de R$ 0.50\n";
    $N = $N % 50;

    $value = (int) ($N / 25);
    echo "$value moeda(s) de R$ 0.25\n";
    $N = $N % 25;

    $value = (int) ($N / 10);
    echo "$value moeda(s) de R$ 0.10\n";
    $N = $N % 10;

    $value = (int) ($N / 5);
    echo "$value moeda(s) de R$ 0.05\n";
    $N = $N % 5;

    $value = (int) ($N / 1);
    echo "$value moeda(s) de R$ 0.01\n";

?>