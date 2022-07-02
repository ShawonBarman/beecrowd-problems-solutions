var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var hour = parseInt(lines.shift());
var kmh = parseInt(lines.shift());

var ans = (hour * kmh) / 12;

console.log(ans.toFixed(3));