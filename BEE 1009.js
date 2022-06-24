var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var name = lines.shift();
var fixed_salary = parseFloat(lines.shift());
var total_sale = parseFloat(lines.shift());

console.log("TOTAL = R$", (fixed_salary+(total_sale*0.15)).toFixed(2));