#include <bits/stdc++.h>

using namespace std;

int main(){
    while(1){
        int x;
        cin >> x;
        if (x == 0){
            break;
        }
        int i;
        for(i = 1; i < x; i++){
            cout << i << " ";
        }
        cout << i << endl;
    }
    return 0;
}