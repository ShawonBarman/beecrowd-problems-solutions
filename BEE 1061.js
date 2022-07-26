var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');
var sep = [' ', '\n'];
// console.log(separators.join('|'));
var line = input.split(new RegExp(sep.join('|'), 'g'));

var str1 = line.shift();
var day1 = parseInt(line.shift());
var hour1 = parseInt(line.shift());
var str2 = line.shift();
var minute1 = parseInt(line.shift());
var str3 = line.shift();
var second1 = parseInt(line.shift());
var str4 = line.shift();
var day2 = parseInt(line.shift());
var hour2 = parseInt(line.shift());
var str5 = line.shift();
var minute2 = parseInt(line.shift());
var str6 = line.shift();
var second2 = parseInt(line.shift());

var total_first_day = (day1 * 24 * 3600) + (hour1 * 3600) + (minute1 * 60) + second1;
var total_second_day = (day2 * 24 * 3600) + (hour2 * 3600) + (minute2 * 60) + second2;
var diff = total_second_day - total_first_day;
var d = parseInt(diff / (24 * 3600));
var h = parseInt((diff % (24 * 3600)) / 3600);
var m = parseInt(((diff % (24 * 3600)) % 3600) / 60);
var s = parseInt(((diff % (24 * 3600)) % 3600) % 60);

console.log(d +" dia(s)");
console.log(h +" hora(s)");
console.log(m +" minuto(s)");
console.log(s +" segundo(s)");