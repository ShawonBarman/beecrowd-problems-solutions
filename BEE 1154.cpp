#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)
using namespace std;

int main(){
    int sum = 0;
    int cnt = 0;
    while(1){
        int n;
        cin >> n;
        if (n < 0){
            break;
        }
        sum += n;
        cnt += 1;
    }
    cout << FIXED_FLOAT(((1.0) * sum) / cnt) << endl;
    return 0;
}

