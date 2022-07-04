var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift());

var hour = parseInt(num / 3600);
var minute = parseInt((num % 3600) / 60);
var second = (num % 3600) % 60;

console.log(hour+":"+minute+":"+second);