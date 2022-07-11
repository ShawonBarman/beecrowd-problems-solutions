var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var n1 = parseFloat(line.shift());
var n2 = parseFloat(line.shift());
var n3 = parseFloat(line.shift());
var n4 = parseFloat(line.shift());

var avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

console.log("Media:", avg.toFixed(1));

if (avg >= 7){
    console.log("Aluno aprovado.");
}
else if (avg < 5){
    console.log("Aluno reprovado.");
}
else{
    console.log("Aluno em exame.");
    var score = parseFloat(line.shift());
    console.log("Nota do exame:", score.toFixed(1));
    var new_avg = (avg + score) / 2;
    if (new_avg >= 5){
        console.log("Aluno aprovado.");
    }
    else{
        console.log("Aluno reprovado.");
    }
    console.log("Media final:", new_avg.toFixed(1));
}