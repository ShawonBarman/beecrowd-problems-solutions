<?php

    $arr = explode(" ", readline());
    $arr[0] = (int) $arr[0];
    $arr[1] = (int) $arr[1];
    $arr[2] = (int) $arr[2];
    $new_arr = $arr;
    sort($arr);
    foreach($arr as $value){
        echo "$value\n";
    }
    echo "\n";
    foreach($new_arr as $value){
        echo "$value\n";
    }

?>