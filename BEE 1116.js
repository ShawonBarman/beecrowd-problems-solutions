var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n = parseInt(line.shift());

for (var i = 0; i < n; i ++){
    var x = parseInt(line.shift());
    var y = parseInt(line.shift());
    if (y === 0){
        console.log("divisao impossivel");
    }
    else{
        console.log((x / y).toFixed(1));
    }
}