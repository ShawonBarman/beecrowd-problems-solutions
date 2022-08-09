#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    for (int i = 0; i < n; i++){
        int x, y;
        cin >> x >> y;
        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        int sum = 0;
        for (int j = x+1; j < y; j++){
            if (j % 2 != 0){
                sum += j;
            }
        }
        cout << sum << endl;
    }
    return 0;
}