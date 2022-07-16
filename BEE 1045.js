var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var a = parseFloat(line.shift())
var b = parseFloat(line.shift())
var c = parseFloat(line.shift())
var arr = [a, b, c];
arr.sort(function(a, b){return a - b});
a = arr[2];
b = arr[1];
c = arr[0];

if (a >= (b + c)){
    console.log("NAO FORMA TRIANGULO");
}
else if ((a * a) == ((b * b) + (c * c))){
    console.log("TRIANGULO RETANGULO");
}
else if ((a * a) > ((b * b) + (c * c))){
    console.log("TRIANGULO OBTUSANGULO");
}
else if ((a * a) < ((b * b) + (c * c))){
    console.log("TRIANGULO ACUTANGULO");
}

if (a == b && a == c){
    console.log("TRIANGULO EQUILATERO");
}

if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
    console.log("TRIANGULO ISOSCELES");
}