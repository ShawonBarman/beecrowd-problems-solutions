#include<iostream>
#include<math.h>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(4) << (x)

using namespace std;

int main(){
    float x1, x2, y1, y2;
    cin >> x1 >> y1;
    cin >> x2 >> y2;
    float distance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    cout << FIXED_FLOAT(distance) << endl;
    return 0;
}