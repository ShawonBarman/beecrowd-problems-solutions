var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a = parseInt(lines.shift());
var b = parseInt(lines.shift());
var c = parseInt(lines.shift());

var maiorAB = (a+b+Math.abs(a-b))/2;
var greatestValue = (maiorAB+c+Math.abs(maiorAB-c))/2;

console.log(greatestValue+" eh o maior");