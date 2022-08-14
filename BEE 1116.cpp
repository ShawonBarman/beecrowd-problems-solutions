#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)

using namespace std;

int main(){
    int n;
    cin >> n;
    for (int i = 0; i < n; i ++){
        int x, y;
        cin >> x >> y;
        if (y == 0){
            cout << "divisao impossivel" << endl;
        }
        else{
            cout << FIXED_FLOAT(((1.0) * x) / y) << endl;
        }
    }
    return 0;
}