var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var a = parseInt(line.shift());
var n = parseInt(line.shift());

while(n <= 0){ n = parseInt(line.shift());}

var sum = 0;
for (var i = 0; i < n; i++){
    sum += i + a;
}
console.log(sum);