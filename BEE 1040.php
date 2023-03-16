<?php

    list($n1, $n2, $n3, $n4) = explode(" ", readline());
    $n1 = (float) $n1;
    $n2 = (float) $n2;
    $n3 = (float) $n3;
    $n4 = (float) $n4;
    $media = (($n1 * 2) + ($n2 * 3) + ($n3 * 4) + ($n4 * 1)) / (2 + 3 + 4 + 1);
    $media = number_format($media, 1, ".", "");
    echo "Media: {$media}\n";
    if ($media >= 7.0){
        echo "Aluno aprovado.\n";
    }
    elseif ($media < 5.0){
        echo "Aluno reprovado.\n";
    }
    elseif (($media >= 5.0) and ($media < 7.0)){
        echo "Aluno em exame.\n";
        $score = readline();
        echo "Nota do exame: {$score}\n";
        $new_media = ($media + $score) / 2;
        $new_media = number_format($new_media, 1, ".", "");
        if ($new_media >= 5.0)
        {
            echo "Aluno aprovado.\n";
        }
        else{
            echo "Aluno reprovado.\n";
        }
        echo "Media final: {$new_media}\n";
    }

?>