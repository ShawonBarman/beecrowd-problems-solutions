#include<iostream>

#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(3) << (x)

using namespace std;

int main(){
    double pi = 3.14159;
    double r;
    cin >> r;
    double ans = (4.0/3)*pi*(r*r*r);
    cout<<"VOLUME = "<<FIXED_FLOAT(ans)<<endl;
    return 0;
}