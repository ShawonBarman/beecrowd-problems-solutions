#include <iostream>
#include <iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)
using namespace std;

int main(){
    float x, y, z;
    cin >> x >> y >> z;
    if ((x + y > z) && (y + z > x) && (x + z > y)){
        cout << "Perimetro = " << FIXED_FLOAT(x + y + z) << endl;
    }
    else{
        cout << "Area = " << FIXED_FLOAT((1.0/2) * (x + y) * z) << endl;
    }
    return 0;
}