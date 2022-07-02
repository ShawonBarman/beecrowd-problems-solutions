#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(3) << (x)

using namespace std;

int main(){
    int hour, kmh;
    cin >> hour;
    cin >> kmh;
    double ans = (hour * kmh)/12.0;
    cout << FIXED_FLOAT(ans) << endl;
    return 0;
}