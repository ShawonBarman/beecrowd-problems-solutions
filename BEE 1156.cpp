#include <bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    float s = 1;
    int x = 2;
    for (int i = 3; i < 40 ; i += 2){
        s += (((1.0) * i) / x);
        x *= 2;
    }
    cout << FIXED_FLOAT(s) << endl;
    return 0;
}