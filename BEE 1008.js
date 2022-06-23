var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift());
var working_hour = parseInt(lines.shift());
var hour_rate = parseFloat(lines.shift());

console.log("NUMBER =", num);
console.log("SALARY = U$", (working_hour*hour_rate).toFixed(2));