var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

var arr = [0, 1];

for (var i = 2; i < n; i++){
    arr.push(arr[i-1] + arr[i - 2]);
}

for (var i = 0; i < n; i++){
    if (i === (n - 1)){
        console.log(arr[i]);
    }
    else{
        process.stdout.write(arr[i]+ " ");
    }
}