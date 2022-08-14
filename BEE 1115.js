var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

while(true){
    var x = parseInt(line.shift());
    var y = parseInt(line.shift());
    if (x === 0 || y === 0){
        break;
    }
    else if (x > 0 && y > 0){
        console.log("primeiro");
    }
    else if (x > 0 && y < 0){
        console.log("quarto");
    }
    else if (x < 0 && y < 0){
        console.log("terceiro");
    }
    else{
        console.log("segundo");
    }
}