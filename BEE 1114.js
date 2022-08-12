var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while(true){
    var password = parseInt(lines.shift());
    if (password == 2002){
        console.log("Acesso Permitido");
        break;
    }
    else{
        console.log("Senha Invalida");
    }
}