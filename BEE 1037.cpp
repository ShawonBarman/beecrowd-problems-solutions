#include <iostream>

using namespace std;

int main(){
    float num;
    cin >> num;

    if (num > 75.00001 && num <= 100){
        cout << "Intervalo (75,100]" << endl;
    }
    else if (num > 50.00001 && num <= 75){
        cout << "Intervalo (50,75]" << endl;
    }
    else if (num > 25.00001 && num <= 50){
        cout << "Intervalo (25,50]" << endl;
    }
    else if (num >= 0 && num <= 25){
        cout << "Intervalo [0,25]" << endl;
    }
    else{
        cout << "Fora de intervalo" << endl;
    }

    return 0;
}