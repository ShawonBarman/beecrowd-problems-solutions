var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

var cnt = 0;

for (var i = 0; i < n; i++){
    var num = parseInt(lines.shift());
    if (num >= 10 && num <= 20){
        cnt += 1;
    }
}

console.log(cnt +" in");
console.log((n - cnt) +" out");