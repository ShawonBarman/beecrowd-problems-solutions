var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var sum = 0;
var cnt = 0;
for(let i = 0; i < 6; i++){
    var num = parseFloat(lines.shift());
    if (num >= 0){
        sum += num;
        cnt += 1;
    }
}
console.log(cnt+" valores positivos");
console.log((sum / cnt).toFixed(1));