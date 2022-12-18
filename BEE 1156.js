var s = 1.0;
var x = 2;

for (var i = 3; i < 40 ; i += 2){
    s += (((1.0) * i) / x);
    x *= 2;
}

console.log(s.toFixed(2));