var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while(true){
    var x = parseInt(lines.shift());
    if (x === 0){
        break;
    }
    var i;
    for(i = 1; i < x; i++){
        process.stdout.write(i+ " ");
    }
    console.log(i);
}