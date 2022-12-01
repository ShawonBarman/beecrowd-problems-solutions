#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    int ans = 1;
    for (int i = 1; i <= n; i++){
        ans *= i;
    }
    cout << ans << endl;
    return 0;
}

