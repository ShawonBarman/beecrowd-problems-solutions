#include <bits/stdc++.h>

using namespace std;

int main(){
    int x, y;
    cin >> x;
    cin >> y;
    if (x > y){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
    int sum = 0;
    for (int i = x; i <= y; i++){
        if (i % 13 != 0){
            sum += i;
        }
    }
    cout << sum << endl;
    return 0;
}