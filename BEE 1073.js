var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (var i = 1; i <= n; i++){
    if (i % 2 == 0){
        console.log(i +"^2 = "+ (i*i));
    }
}