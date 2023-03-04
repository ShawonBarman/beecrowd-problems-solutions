<?php

    $employeeNumber = readline();
    $workingHour = readline();
    $amountPerHour = readline();

    $salary = $workingHour * $amountPerHour;
    $salary = number_format($salary, 2, ".", "");

    echo "NUMBER = $employeeNumber\n";
    echo "SALARY = U$ $salary\n";

?>