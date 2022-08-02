#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    int cnt = 0;
    for (int i = 0; i < n; i++){
        int num;
        cin >> num;
        if (num >= 10 && num <= 20){
            cnt += 1;
        }
    }
    cout << cnt << " in" << endl;
    cout << (n - cnt) << " out" << endl;
    return 0;
}