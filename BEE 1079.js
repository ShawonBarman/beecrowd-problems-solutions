var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n = parseInt(line.shift());

for (let i = 0; i < n; i++){
    var num1 = parseFloat(line.shift());
    var num2 = parseFloat(line.shift());
    var num3 = parseFloat(line.shift());
    var avg = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);
    console.log(avg.toFixed(1));
}