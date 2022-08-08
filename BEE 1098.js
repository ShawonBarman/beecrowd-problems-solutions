for (var i = 0; i <= 2.01; i += 0.2){
    for (var j = 1; j < 4; j++){
        if (i == 0 || i == 1 || i.toFixed(1) == 2){
            console.log("I="+ i.toFixed(0) +" J="+ (j+i).toFixed(0));
        }
        else{
            console.log("I="+ i.toFixed(1) +" J="+ (j+i).toFixed(1));
        }
    }
}