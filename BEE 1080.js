var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var maxi = -99999999;
var position = 0;

for (let i = 1; i <= 100; i++){
    var num = parseInt(lines.shift());
    if (num > maxi){
        maxi = num;
        position = i;
    }
}

console.log(maxi);
console.log(position);