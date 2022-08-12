var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

while (true){
    var x = parseInt(line.shift());
    var y = parseInt(line.shift());
    if (x === y){
        break;
    }

    if (x > y){
        console.log("Decrescente");
    }
    else{
        console.log("Crescente");
    }
}