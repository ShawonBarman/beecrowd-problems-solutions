var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var y = parseInt(lines.shift());

if (x > y){
    var temp = x;
    x = y;
    y = temp;
}

var sum = 0;

for (var i = x; i <= y; i++){
    if (i % 13 !== 0){
        sum += i;
    }
}

console.log(sum);