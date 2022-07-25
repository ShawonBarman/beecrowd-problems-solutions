#include<bits/stdc++.h>

using namespace std;

int main(){
    float num;
    int count = 0;
    for(int i = 0; i < 6; i++){
        cin >> num;
        if (num >= 0){
            count += 1;
        }
    }
    cout << count << " valores positivos" << endl;
    return 0;
}