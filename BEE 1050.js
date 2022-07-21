var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift())

if (num == 61){
    console.log("Brasilia");
}
else if (num == 71){
    console.log("Salvador");
}
else if (num == 11){
    console.log("Sao Paulo");
}
else if (num == 21){
    console.log("Rio de Janeiro");
}
else if (num == 32){
    console.log("Juiz de Fora");
}
else if (num == 19){
    console.log("Campinas");
}
else if (num == 27){
    console.log("Vitoria");
}
else if (num == 31){
    console.log("Belo Horizonte");
}
else{
    console.log("DDD nao cadastrado");
}