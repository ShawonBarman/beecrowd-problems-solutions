var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var x = parseInt(line.shift());
var y = parseInt(line.shift());
var z = parseInt(line.shift());

var arr = [x, y, z];
arr.sort(function(a, b){return a - b});

console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);
console.log();
console.log(x);
console.log(y);
console.log(z);