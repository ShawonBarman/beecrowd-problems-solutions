var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var a = parseInt(line.shift())
var b = parseInt(line.shift())

if ((b % a === 0) || (a % b === 0)){
    console.log("Sao Multiplos");
}
else{
    console.log("Nao sao Multiplos");
}