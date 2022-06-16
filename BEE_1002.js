var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = 3.14159;
var r = parseFloat(lines.shift());
var ans = n * (r * r);
console.log("A="+ans.toFixed(4));