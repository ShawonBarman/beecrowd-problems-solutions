var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift());

var year = parseInt(num / 365);
var month = parseInt((num % 365) / 30);
var day = (num % 365) % 30;

console.log(year+" ano(s)");
console.log(month+" mes(es)");
console.log(day+" dia(s)");