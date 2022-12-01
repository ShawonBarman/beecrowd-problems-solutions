var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

var ans = 1;
for (let i = 1; i <= n; i++){
    ans *= i;
}
console.log(ans);