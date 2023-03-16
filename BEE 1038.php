<?php

    list($code, $amount) = explode(" ", readline());
    $code = (int) $code;
    $amount = (float) $amount;
    if ($code == 1){
        $amount = 4.0 * $amount;
        $amount = number_format($amount, 2, ".", "");
        echo "Total: R$ {$amount}\n";
    }
    elseif ($code == 2){
        $amount = 4.50 * $amount;
        $amount = number_format($amount, 2, ".", "");
        echo "Total: R$ {$amount}\n";
    }
    elseif ($code == 3){
        $amount = 5.0 * $amount;
        $amount = number_format($amount, 2, ".", "");
        echo "Total: R$ {$amount}\n";
    }
    elseif ($code == 4){
        $amount = 2.0 * $amount;
        $amount = number_format($amount, 2, ".", "");
        echo "Total: R$ {$amount}\n";
    }
    elseif ($code == 5){
        $amount = 1.50 * $amount;
        $amount = number_format($amount, 2, ".", "");
        echo "Total: R$ {$amount}\n";
    }

?>