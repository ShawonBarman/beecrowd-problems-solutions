var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const pi = 3.14159;
var r = parseFloat(lines);
var ans = (4.0/3)*pi*(r*r*r);

console.log("VOLUME =", ans.toFixed(3));