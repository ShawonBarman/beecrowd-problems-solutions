#include <bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    double num;
    cin >> num;
    if (num >= 0 && num <= 2000){
        cout << "Isento" << endl;
    }
    else if (num > 2000 && num <= 3000){
        cout << "R$ " << FIXED_FLOAT((num - 2000) * (8.0 / 100)) << endl;
    }
    else if (num > 3000 && num <= 4500){
        double ans = (1000 * (8.0 / 100)) + ((num - 3000) * (18.0 / 100));
        cout << "R$ " << FIXED_FLOAT(ans) << endl;
    }
    else{
        double ans = (1000 * (8.0 / 100)) + (1500 * (18.0 / 100)) + ((num - 4500) * (28.0 / 100));
        cout << "R$ " << FIXED_FLOAT(ans) << endl;
    }
}