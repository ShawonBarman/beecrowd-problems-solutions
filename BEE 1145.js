var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var x = parseInt(line.shift());
var y = parseInt(line.shift());

var cnt = 0;

for (var i = 1; i <= y; i++){
    cnt += 1;
    if (cnt == x){
        console.log(i);
        cnt = 0;
    }
    else{
        process.stdout.write(i+ " ");
    }
}