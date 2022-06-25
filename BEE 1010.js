var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var p1 = parseInt(line.shift());
var u1 = parseInt(line.shift());
var price1 = parseFloat(line.shift());

var p2 = parseInt(line.shift());
var u2 = parseInt(line.shift());
var price2 = parseFloat(line.shift());

console.log("VALOR A PAGAR: R$", ((u1*price1)+(u2*price2)).toFixed(2));