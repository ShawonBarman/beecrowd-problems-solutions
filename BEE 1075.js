var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (let i = 2; i < 10000; i++){
    if (i % n == 2){
        console.log(i);
    }
}