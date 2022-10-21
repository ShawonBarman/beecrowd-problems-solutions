#include <bits/stdc++.h>

using namespace std;

int main(){
    int x, y;
    cin >> x >> y;
    int cnt = 0;
    for (int i = 1; i <= y; i++){
        cnt += 1;
        if (cnt == x){
            cout << i << endl;
            cnt = 0;
        }
        else{
            cout << i << " ";
        }
    }
    return 0;
}