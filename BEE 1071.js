var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var y = parseInt(lines.shift());

if (x > y){
    var temp;
    temp = x;
    x = y;
    y = temp;
}
var sum = 0;
for (let i = x+1; i < y; i++){
    if (i % 2 !== 0){
        sum += i;
    }
}
console.log(sum);