#include <bits/stdc++.h>

using namespace std;

int main(){
    int x, z;
    cin >> x;
    cin >> z;
    while(z <= x){ cin >> z;}
    int sum = 0;
    int cnt = 1;
    for (int i = x; i < z; i++){
        sum += i;
        if (sum < z){
            cnt += 1;
        }
    }
    cout << cnt << endl;
    return 0;
}