#include<bits/stdc++.h>

using namespace std;

int main(){
    int num;
    int maxi = -99999999;
    int position = 0;
    for (int i = 1; i <= 100; i++){
        cin >> num;
        if (num > maxi){
            maxi = num;
            position = i;
        }
    }
    cout << maxi << endl;
    cout << position << endl;
    return 0;
}