var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift());
var c = parseFloat(lines.shift());

var avg = (a*2 + b*3 + c*5)/(2+3+5);

console.log("MEDIA =", avg.toFixed(1));