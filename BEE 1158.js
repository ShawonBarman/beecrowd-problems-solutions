var input = require('fs').readFileSync('/dev/stdin', 'utf-8');
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n = parseInt(line.shift());
while(n !== 0){
    var x = parseInt(line.shift());
    var y = parseInt(line.shift());
    var ans = 0;
    while(y !== 0){
        if (x % 2 !== 0){
            ans += x;
            y -= 1;
        }
        x += 1;
    }
    console.log(ans);
    n -= 1;
}