#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    while(n != 0){
        int x, y;
        cin >> x >> y;
        int ans = 0;
        while(y != 0){
            if (x % 2 != 0){
                ans += x;
                y -= 1;
            }
            x += 1;
        }
        cout << ans << endl;
        n -= 1;
    }
    return 0;
}