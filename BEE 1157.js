var input = require('fs').readFileSync('/dev/stdin', 'utf-8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (var i = 1; i <= n; i++){
    if (n % i === 0){
        console.log(i);
    }
}