#include <iostream>
#include <iomanip>
#define FIXED_FLOAT(x) std::fixed <<std::setprecision(4)<<(x)
using namespace std;
 
int main() {
 
    double n = 3.14159;
    double r;
    cin >> r;
    cout<<"A="<<FIXED_FLOAT(n*(r*r))<<endl;
    return 0;
}