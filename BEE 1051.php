<?php

    $salary = (float)readline();
    if ($salary >= 0 && $salary <= 2000.00){
        echo "Isento\n";
    }
    else{
        $tax = 0;
        if ($salary >= 2000.01 && $salary <= 3000.00){
            $tax = ($salary - 2000) * (8 /100);
        }
        elseif ($salary >= 3000.01 && $salary <= 4500.00){
            $tax = (1000 * (8 /100)) + (($salary - 3000) * (18 /100));
        }
        else{
            $tax = (1000 * (8 /100)) + (1500 * (18 /100)) + (($salary - 4500) * (28 /100));
        }
        $tax = number_format($tax, 2, ".", "");
        echo "R$ {$tax}\n";
    }
    
?>