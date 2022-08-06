var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n = parseInt(line.shift());
var c = 0;
var r = 0;
var s = 0;
for (let i = 0; i < n; i++){
    var a = parseInt(line.shift());
    var b = line.shift();
    if (a >= 1 && a <= 15) {
        if (b == "C") {
            c += a;
        }
        if (b == "R") {
            r += a;
        }
        if (b == "S") {
            s += a;
        }
    }
}
var total = c + r + s;
console.log("Total:", total, "cobaias");
console.log("Total de coelhos:", c);
console.log("Total de ratos:", r);
console.log("Total de sapos:", s);

console.log("Percentual de coelhos:", ((c * 100.0) / total).toFixed(2), "%");
console.log("Percentual de ratos:", ((r * 100.0) / total).toFixed(2), "%");
console.log("Percentual de sapos:", ((s * 100.0) / total).toFixed(2), "%");