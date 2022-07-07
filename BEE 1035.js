var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var a = parseInt(line.shift());
var b = parseInt(line.shift());
var c = parseInt(line.shift());
var d = parseInt(line.shift());

if ((b > c) && (d > a) && (c+d > a+b) && (c >= 0 && d >= 0) && (a%2 == 0)){
    console.log("Valores aceitos");
}
else{
    console.log("Valores nao aceitos");
}