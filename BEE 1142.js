var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift());

var count = 0;

for (var i = 1; i <= num * 4; i++){
    if (count === 3){
        console.log("PUM");
        count = 0;
        continue;
    }
    process.stdout.write(i+ " ");
    count += 1;
}