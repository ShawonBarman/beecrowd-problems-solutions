var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var cnt = 0;
for(let i = 0; i < 6; i++){
    var num = parseFloat(lines.shift()).toFixed(2);
    if (num >= 0){
        cnt += 1;
    }
}
console.log(cnt+" valores positivos");