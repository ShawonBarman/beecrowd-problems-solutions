var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n = parseInt(line.shift());

for (var i = 0; i < n; i++){
    var x = parseInt(line.shift());
    var y = parseInt(line.shift());
    if (x > y){
        var temp = x;
        x = y;
        y = temp;
    }
    var sum = 0;
    for (var j = x+1; j < y; j++){
        if (j % 2 !== 0){
            sum += j;
        }
    }
    console.log(sum);
}