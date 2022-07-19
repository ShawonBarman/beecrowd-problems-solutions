#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    float num;
    cin >> num;
    if (num >= 0 && num <= 400){
        float earned = num * (15.0/100);
        cout << "Novo salario: " << FIXED_FLOAT(earned + num) << endl;
        cout << "Reajuste ganho: " << FIXED_FLOAT(earned) << endl;
        cout << "Em percentual: 15 %" << endl;
    }
    else if (num > 400 && num <= 800){
        float earned = num * (12.0/100);
        cout << "Novo salario: " << FIXED_FLOAT(earned + num) << endl;
        cout << "Reajuste ganho: " << FIXED_FLOAT(earned) << endl;
        cout << "Em percentual: 12 %" << endl;
    }
    else if (num > 800 && num <= 1200){
        float earned = num * (10.0/100);
        cout << "Novo salario: " << FIXED_FLOAT(earned + num) << endl;
        cout << "Reajuste ganho: " << FIXED_FLOAT(earned) << endl;
        cout << "Em percentual: 10 %" << endl;
    }
    else if (num > 1200 && num <= 2000){
        float earned = num * (7.0/100);
        cout << "Novo salario: " << FIXED_FLOAT(earned + num) << endl;
        cout << "Reajuste ganho: " << FIXED_FLOAT(earned) << endl;
        cout << "Em percentual: 7 %" << endl;
    }
    else{
        float earned = num * (4.0/100);
        cout << "Novo salario: " << FIXED_FLOAT(earned + num) << endl;
        cout << "Reajuste ganho: " << FIXED_FLOAT(earned) << endl;
        cout << "Em percentual: 4 %" << endl;
    }
    return 0;
}