#include<bits/stdc++.h>

using namespace std;

int main(){
    int x;
    cin >> x;
    int cnt = 0;
    while(cnt < 12){
        if (x % 2 == 1){
            cout << x << endl;
        }
        x += 1;
        cnt += 1;
    }
    return 0;
}