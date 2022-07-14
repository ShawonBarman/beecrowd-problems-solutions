var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var x = parseFloat(line.shift());
var y = parseFloat(line.shift());
var z = parseFloat(line.shift());

if ((x + y > z) && (y + z > x) && (x + z > y)){
    console.log("Perimetro =", (x + y + z).toFixed(1));
}
else{
    console.log("Area =", ((1.0/2) * (x + y) * z).toFixed(1));
}