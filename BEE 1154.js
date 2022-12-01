var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var sum = 0;
var cnt = 0;

while(true){
    var n = parseInt(lines.shift());
    if (n < 0){
        break;
    }
    sum += n;
    cnt += 1;
}

console.log((sum / cnt).toFixed(2));
