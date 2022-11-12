var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var z = parseInt(lines.shift());
while(z <= x){ z = parseInt(lines.shift());}
var sum = 0;
var cnt = 1;
for (var i = x; i < z; i++){
    sum += i;
    if (sum < z){
        cnt += 1;
    }
}
console.log(cnt);