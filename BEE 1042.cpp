#include <bits/stdc++.h>

using namespace std;

int main(){
    int x, y, z;
    cin >> x >> y >> z;
    int arr[] = {x, y, z};
    sort(arr, arr + 3);
    cout << arr[0] << endl;
    cout << arr[1] << endl;
    cout << arr[2] << endl;
    cout << endl;
    cout << x << endl;
    cout << y << endl;
    cout << z << endl;
    return 0;
}