var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var num = parseInt(lines.shift());

console.log(num);

console.log(parseInt(num/100)+" nota(s) de R$ 100,00");
num = num % 100;
console.log(parseInt(num/50)+" nota(s) de R$ 50,00");
num = num % 50;
console.log(parseInt(num/20)+" nota(s) de R$ 20,00");
num = num % 20;
console.log(parseInt(num/10)+" nota(s) de R$ 10,00");
num = num % 10;
console.log(parseInt(num/5)+" nota(s) de R$ 5,00");
num = num % 5;
console.log(parseInt(num/2)+" nota(s) de R$ 2,00");
num = num % 2;
console.log(num+" nota(s) de R$ 1,00");