var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());

var cnt = 0;
while(cnt < 12){
    if (x % 2 == 1){
        console.log(x);
    }
    x += 1;
    cnt += 1;
}