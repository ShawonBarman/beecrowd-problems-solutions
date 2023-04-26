<?php

    $employee_salary = (float)readline();
    $employee_new_salary = 0;
    $x = 0;
    if ($employee_salary >= 0 && $employee_salary <= 400.00){
        $x = 15;
        $employee_new_salary = $employee_salary + ($employee_salary * ($x/100));
    }
    elseif ($employee_salary >= 400.01 && $employee_salary <= 800.00){
        $x = 12;
        $employee_new_salary = $employee_salary + ($employee_salary * ($x/100));
    }
    elseif ($employee_salary >= 800.01 && $employee_salary <= 1200.00){
        $x = 10;
        $employee_new_salary = $employee_salary + ($employee_salary * ($x/100));
    }
    elseif ($employee_salary >= 1200.01 && $employee_salary <= 2000.00){
        $x = 7;
        $employee_new_salary = $employee_salary + ($employee_salary * ($x/100));
    }
    else{
        $x = 4;
        $employee_new_salary = $employee_salary + ($employee_salary * ($x/100));
    }

    $employee_new_salary = number_format($employee_new_salary, 2, '.', "");
    $earned_money = $employee_new_salary - $employee_salary;
    $earned_money = number_format($earned_money, 2, '.', "");
    echo "Novo salario: {$employee_new_salary}\n";
    echo "Reajuste ganho: {$earned_money}\n";
    echo "Em percentual: {$x} %\n";

?>