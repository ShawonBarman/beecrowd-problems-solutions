#include<iostream>
#include <iomanip>

#define FIXED_FLOAT(x) std::fixed <<std::setprecision(5)<<(x)

using namespace std;

int main(){

    double a, b, avg;
    cin>>a;
    cin>>b;
    avg = (a*3.5 + b*7.5)/(3.5 + 7.5);
    cout<<"MEDIA = "<<FIXED_FLOAT(avg)<<endl;

    return 0;
}