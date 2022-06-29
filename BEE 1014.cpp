#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(3) << (x)

using namespace std;

int main(){
    int x;
    float y, total;
    cin >> x;
    cin >> y;
    total = x / y;
    cout<<FIXED_FLOAT(total)<<" km/l"<<endl;
    return 0;
}