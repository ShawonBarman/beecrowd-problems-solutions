var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var h1 = parseInt(line.shift());
var m1 = parseInt(line.shift());
var h2 = parseInt(line.shift());
var m2 = parseInt(line.shift());

var total_hour, total_minute;

if ((h1 == h2) && (m1 == m2)){
    total_hour = (24 - h1) + h2;
    total_minute = m2 - m1; 
}
else if ((h1 == h2) && (m1 < m2)){
    total_hour = h2 - h1;
    total_minute = m2 - m1; 
}
else if ((h1 == h2) && (m1 > m2)){
    total_hour = (24 - h1) + h2 - 1;
    total_minute = (60 - m1) + m2; 
}
else if ((h1 < h2) && (m1 == m2)){
    total_hour = h2 - h1;
    total_minute = m2 - m1;
}
else if ((h1 > h2) && (m1 == m2)){
    total_hour = (24 - h1) + h2;
    total_minute = m2 - m1;
}
else if ((h1 < h2) && (m1 < m2)){
    total_hour = h2 - h1;
    total_minute = m2 - m1;
}
else if ((h1 < h2) && (m1 > m2)){
    total_hour = h2 - h1 - 1;
    total_minute = (60 - m1) + m2;
}
else if ((h1 > h2) && (m1 < m2)){
    total_hour = (24 - h1) + h2 - 1;
    total_minute = m2 - m1;
}
else{
    total_hour = (24 - h1) + h2 - 1;
    total_minute = (60 - m1) + m2;
}

console.log("O JOGO DUROU", total_hour, "HORA(S) E", total_minute, "MINUTO(S)");