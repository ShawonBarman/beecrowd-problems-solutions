#include <bits/stdc++.h>

using namespace std;

int main(){
    int a, n;
    cin >> a;
    cin >> n;
    while(n <= 0){ cin >> n;}
    int sum = 0;
    for (int i = 0; i < n; i++){
        sum += i + a;
    }
    cout << sum << endl;
    return 0;
}