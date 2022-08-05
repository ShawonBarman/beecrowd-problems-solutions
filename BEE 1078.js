var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (let i = 1; i <= 10; i++){
    console.log(i +" x "+ n +" = "+ (i * n));
}