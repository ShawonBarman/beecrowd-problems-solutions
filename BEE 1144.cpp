#include <bits/stdc++.h>

using namespace std;

int main(){
    int num;
    cin >> num;
    for (int i = 1; i <= num; i++){
        cout << i << " " << (i * i) << " " << (i * i * i) << endl;
        cout << i << " " << (i * i) + 1 << " " << (i * i * i) + 1 << endl;
    }
    return 0;
}