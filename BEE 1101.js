var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

while (true){
    var m = parseInt(line.shift());
    var n = parseInt(line.shift());
    if (m === 0 || m < 0 || n === 0 || n < 0){
        break;
    }

    if (m < n){
        var temp = m;
        m = n;
        n = temp;
    }

    var sum = 0;

    for (var i = n; i <= m ; i ++){
        sum += i;
        process.stdout.write(i + " ");
    }
    console.log("Sum="+sum);
}