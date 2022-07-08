var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var A = parseFloat(line.shift());
var B = parseFloat(line.shift());
var C = parseFloat(line.shift());

var root = (B * B - 4 * A * C);

if((A !== 0) && (root > 0)){
    var R1 = (- B + Math.sqrt(root)) / (2 * A);
    var R2 = (- B - Math.sqrt(root)) / (2 * A);
    console.log("R1 =", R1.toFixed(5));
    console.log("R2 =", R2.toFixed(5));
}
else{
    console.log("Impossivel calcular");
}