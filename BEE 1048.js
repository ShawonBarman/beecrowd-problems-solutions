var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseFloat(lines.shift());

var earned;

if (num >= 0 && num <= 400){
    earned = num * (15.0/100);
    console.log("Novo salario:", (earned + num).toFixed(2));
    console.log("Reajuste ganho:", earned.toFixed(2));
    console.log("Em percentual: 15 %");
}
else if (num > 400 && num <= 800){
    earned = num * (12.0/100);
    console.log("Novo salario:", (earned + num).toFixed(2));
    console.log("Reajuste ganho:", earned.toFixed(2));
    console.log("Em percentual: 12 %");
}
else if (num > 800 && num <= 1200){
    earned = num * (10.0/100);
    console.log("Novo salario:", (earned + num).toFixed(2));
    console.log("Reajuste ganho:", earned.toFixed(2));
    console.log("Em percentual: 10 %");
}
else if (num > 1200 && num <= 2000){
    earned = num * (7.0/100);
    console.log("Novo salario:", (earned + num).toFixed(2));
    console.log("Reajuste ganho:", earned.toFixed(2));
    console.log("Em percentual: 7 %");
}
else{
    earned = num * (4.0/100);
    console.log("Novo salario:", (earned + num).toFixed(2));
    console.log("Reajuste ganho:", earned.toFixed(2));
    console.log("Em percentual: 4 %");
}