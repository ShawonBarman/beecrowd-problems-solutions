<?php

    $word1 = readline();
    $word2 = readline();
    $word3 = readline();

    if ($word1 == "vertebrado"){
        if ($word2 == "ave"){
            if ($word3 == "carnivoro"){
                echo "aguia\n";
            }
            else{
                echo "pomba\n";
            }
        }
        else{
            if ($word3 == "onivoro"){
                echo "homem\n";
            }
            else{
                echo "vaca\n";
            }
        }
    }
    else{
        if ($word2 == "inseto"){
            if ($word3 == "hematofago"){
                echo "pulga\n";
            }
            else{
                echo "lagarta\n";
            }
        }
        else{
            if ($word3 == "hematofago"){
                echo "sanguessuga\n";
            }
            else{
                echo "minhoca\n";
            }
        }
    }

?>