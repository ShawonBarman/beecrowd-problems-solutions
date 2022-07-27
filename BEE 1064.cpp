#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)

using namespace std;

int main(){
    float num;
    float sum = 0;
    int count = 0;
    for(int i = 0; i < 6; i++){
        cin >> num;
        if (num >= 0){
            sum += num;
            count += 1;
        }
    }
    cout << count << " valores positivos" << endl;
    cout << FIXED_FLOAT(sum / count) << endl;
    return 0;
}