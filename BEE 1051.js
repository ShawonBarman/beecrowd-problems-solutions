var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseFloat(lines.shift())

if (num >= 0 && num <= 2000){
    console.log("Isento");
}
else if (num > 2000 && num <= 3000){
    var ans = (num - 2000) * (8.0 / 100);
    console.log("R$", ans.toFixed(2));
}
else if (num > 3000 && num <= 4500){
    var ans = (1000 * (8.0 / 100)) + ((num - 3000) * (18.0 / 100));
    console.log("R$", ans.toFixed(2));
}
else{
    var ans = (1000 * (8.0 / 100)) + (1500 * (18.0 / 100)) + ((num - 4500) * (28.0 / 100));
    console.log("R$", ans.toFixed(2));
}