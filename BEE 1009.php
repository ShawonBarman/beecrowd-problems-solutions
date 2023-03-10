<?php

    $employeeName = readline();
    $fixedSalary = readline();
    $totalSold = readline();

    $finalSalary = $fixedSalary + ($totalSold * (15/100));
    $finalSalary = number_format($finalSalary, 2, ".", "");

    echo "TOTAL = R$ $finalSalary\n";

?>