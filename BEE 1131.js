var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var grenais = 0;
var inter = 0;
var gremio = 0;
var empates = 0;

while (true)
{
    var i = parseInt(line.shift());
    var g = parseInt(line.shift());
    grenais += 1;
    if (i > g)
    {
        inter += 1;
    }
    else if (i < g)
    {
        gremio += 1;
    }
    else
    {
        empates += 1;
    }
    console.log("Novo grenal (1-sim 2-nao)");
    var n = parseInt(line.shift());
    if (n == 2)
    {
        break;
    }
}
console.log("%d grenais", grenais);
console.log("Inter:%d", inter);
console.log("Gremio:%d", gremio);
console.log("Empates:%d", empates);
if (inter > gremio)
{
    console.log("Inter venceu mais");
}
else if (inter < gremio)
{
    console.log("Gremio venceu mais");
}
else
{
    console.log("Nao houve vencedor");
}