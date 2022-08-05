#include <bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)

using namespace std;

int main(){
    int n;
    cin >> n;
    for (int i = 0; i < n; i++){
        float num1, num2, num3;
        cin >> num1 >> num2 >> num3;
        float avg = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);
        cout << FIXED_FLOAT(avg) << endl;
    }
    return 0;
}