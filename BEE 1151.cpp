#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    int arr[50];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i < n; i++){
        arr[i] = arr[i-1] + arr[i - 2];
    }
    for (int i = 0; i < n; i++){
        if (i == (n - 1)){
            cout << arr[i] << endl;
        }
        else{
            cout << arr[i] << " ";
        }
    }
    return 0;
}
