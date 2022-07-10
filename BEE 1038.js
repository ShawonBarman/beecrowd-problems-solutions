var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var code = parseInt(line.shift());
var items = parseInt(line.shift());

if (code == 1){
    console.log("Total: R$", (4.0 * items).toFixed(2));
}
else if (code == 2){
    console.log("Total: R$", (4.50 * items).toFixed(2));
}
else if (code == 3){
    console.log("Total: R$", (5.0 * items).toFixed(2));
}
else if (code == 4){
    console.log("Total: R$", (2.0 * items).toFixed(2));
}
else if (code == 5){
    console.log("Total: R$", (1.5 * items).toFixed(2));
}