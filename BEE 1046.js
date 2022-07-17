var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var x = parseInt(line.shift());
var y = parseInt(line.shift());

var ans;

if (x < y){
    ans = y - x;
}
else{
    ans = (24 - x) + y;
}

console.log("O JOGO DUROU", ans, "HORA(S)");