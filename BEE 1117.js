var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var sum = 0;
var cnt = 0;

while(cnt != 2){
    var num = parseFloat(lines.shift());
    if (num >= 0 && num <= 10){
        sum += num;
        cnt += 1;
    }
    else{
        console.log("nota invalida");
    }
}
console.log("media =", (sum / cnt).toFixed(2));