#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    int cnt = 0;
    float sum = 0;
    while(cnt != 2){
        float num;
        cin >> num;
        if (num >= 0 && num <= 10){
            sum += num;
            cnt += 1;
        }
        else{
            cout << "nota invalida" << endl;
        }
    }
    cout << "media = " << FIXED_FLOAT(sum / cnt) << endl;
    return 0;
}