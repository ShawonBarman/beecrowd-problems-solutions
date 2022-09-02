#include <bits/stdc++.h>

using namespace std;

int main(){
    int a = 0;
    int g = 0;
    int d = 0;
    while(1){
        int num;
        cin >> num;
        if (num == 4){
            break;
        }
        else if (num == 1){
            a += 1;
        }
        else if (num == 2){
            g += 1;
        }
        else if (num == 3){
            d += 1;
        }
        else{
            continue;
        }
    }
    cout << "MUITO OBRIGADO" << endl;
    cout << "Alcool: " << a << endl;
    cout << "Gasolina: " << g << endl;
    cout << "Diesel: " << d << endl;

    return 0;
}