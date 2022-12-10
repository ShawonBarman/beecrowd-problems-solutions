#include <bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    float s = 1;
    for (int i = 2; i <= 100; i++){
        s += (1.0 / i);
    }
    cout << FIXED_FLOAT(s) << endl;
    return 0;
}