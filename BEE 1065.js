var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var cnt = 0;
for(let i = 0; i < 5; i++){
    var num = parseInt(lines.shift());
    if (num % 2 === 0){
        cnt += 1;
    }
}
console.log(cnt+" valores pares");