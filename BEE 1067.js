var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());

for (var i = 1; i <= x; i++){
    if (i % 2 == 1){
        console.log(i);
    }
}