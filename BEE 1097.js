var x = 7;
for (var i = 1; i < 10; i += 2){
    for (var j = x; j > (x - 3); j--){
        console.log("I="+ i +" J="+ j);
    }
    x += 2;
}