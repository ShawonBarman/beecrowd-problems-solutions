#include <bits/stdc++.h>

using namespace std;

int main(){
    int num;
    cin >> num;
    int count = 0;
    for (int i = 1; i <= num * 4; i++){
        if (count == 3){
            cout << "PUM" << endl;
            count = 0;
            continue;
        }
        cout << i << " ";
        count += 1;
    }
    return 0;
}