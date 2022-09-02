var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a = 0;
var g = 0;
var d = 0;
while(true){
    var num = parseInt(lines.shift());
    if (num == 4){
        break;
    }
    else if (num == 1){
        a += 1;
    }
    else if (num == 2){
        g += 1;
    }
    else if (num == 3){
        d += 1;
    }
    else{
        continue;
    }
}
console.log("MUITO OBRIGADO");
console.log("Alcool: %d", a);
console.log("Gasolina: %d", g);
console.log("Diesel: %d", d);