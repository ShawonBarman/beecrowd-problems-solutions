var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for(let i = 0; i < n; i++){
    var num = parseInt(lines.shift());
    if ((num % 2 === 0) && (num  > 0)){
        console.log("EVEN POSITIVE");
    }
    else if ((num % 2 === 0) && (num  < 0)){
        console.log("EVEN NEGATIVE");
    }
    else if ((num % 2 !== 0) && (num  > 0)){
        console.log("ODD POSITIVE");
    }
    else if ((num % 2 !== 0) && (num  < 0)){
        console.log("ODD NEGATIVE");
    }
    else{
        console.log("NULL");
    }
}