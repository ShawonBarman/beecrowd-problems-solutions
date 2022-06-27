var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var line = input.split(' ');

a = parseFloat(line.shift());
b = parseFloat(line.shift());
c = parseFloat(line.shift());

console.log("TRIANGULO:", ((1.0/2)*a*c).toFixed(3));
console.log("CIRCULO:", (3.14159*(c*c)).toFixed(3));
console.log("TRAPEZIO:", ((1.0/2)*(a+b)*c).toFixed(3));
console.log("QUADRADO:", (b*b).toFixed(3));
console.log("RETANGULO:", (a*b).toFixed(3));