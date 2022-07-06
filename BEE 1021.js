var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseFloat(lines.shift());

var arr = [10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1];
var title = "nota(s) de R$";
var temp, n;

n = parseInt(num * 100);

console.log("NOTAS:");
for (var i = 0; i < arr.length; i++){
    temp = parseInt(n / arr[i]);
    n = n % arr[i];
    if (i == 6) {
        title = "moeda(s) de R$";
        console.log("MOEDAS:");
    }
    console.log(temp + " " + title + " " + (arr[i]/100.00).toFixed(2));
}