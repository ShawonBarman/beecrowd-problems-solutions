var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var total_positive = 0;
var total_negative = 0;
var total_even = 0;
var total_odd = 0;

for(let i = 0; i < 5; i++){
    var num = parseInt(lines.shift());
    if (num  > 0){
        total_positive += 1;
    }
    if (num < 0){
        total_negative += 1;
    }
    if (num % 2 === 0){
        total_even += 1;
    }
    if (num % 2 === 1){
        total_odd += 1;
    }
}
console.log(total_even+" valor(es) par(es)");
console.log(total_odd+" valor(es) impar(es)");
console.log(total_positive+" valor(es) positivo(s)");
console.log(total_negative+" valor(es) negativo(s)");