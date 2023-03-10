<?php

    list($p1_code, $p1_units, $p1_unit_price) = explode(" ", readline());
    list($p2_code, $p2_units, $p2_unit_price) = explode(" ", readline());

    $p1_units = (int) $p1_units;
    $p1_unit_price = (float) $p1_unit_price;
    $p2_units = (int) $p2_units;
    $p2_unit_price = (float) $p2_unit_price;

    $total = ($p1_units * $p1_unit_price) + ($p2_units * $p2_unit_price);
    $total = number_format($total, 2, ".", "");

    echo "VALOR A PAGAR: R$ $total\n";

?>