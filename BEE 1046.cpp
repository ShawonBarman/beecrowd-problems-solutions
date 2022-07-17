#include<bits/stdc++.h>

using namespace std;

int main(){
    int x, y, ans;
    cin >> x >> y;
    if (x < y){
        ans = y - x;
    }
    else{
        ans = (24 - x) + y;
    }
    cout << "O JOGO DUROU " << ans << " HORA(S)" << endl;
    return 0;
}