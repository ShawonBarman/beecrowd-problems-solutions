var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a = lines.shift()

if(a === "vertebrado"){
    var b = lines.shift()
    if(b === "ave"){
        var c = lines.shift()
        if(c === "carnivoro"){
            console.log("aguia");
        }
        else if(c === "onivoro"){
            console.log("pomba");
        }
    }
    if(b === "mamifero"){
        var c = lines.shift()
        if(c === "onivoro"){
            console.log("homem");
        }
        else if(c === "herbivoro"){
            console.log("vaca");
        }
    }
}
else if(a === "invertebrado"){
    var b = lines.shift()
    if(b === "inseto"){
        var c = lines.shift()
        if(c === "hematofago"){
            console.log("pulga");
        }
        else if(c === "herbivoro"){
            console.log("lagarta");
        }
    }
    if(b === "anelideo"){
        var c = lines.shift()
        if(c === "hematofago"){
            console.log("sanguessuga");
        }
        else if(c === "onivoro"){
            console.log("minhoca");
        }
    }
}