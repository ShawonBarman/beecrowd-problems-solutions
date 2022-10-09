var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift());

for (var i = 1; i <= num; i++){
    console.log(i +" "+ (i * i) +" "+ (i * i * i));
    console.log(i +" "+ ((i * i) + 1) +" "+ ((i * i * i) + 1));
}