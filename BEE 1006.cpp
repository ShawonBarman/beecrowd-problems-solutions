#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)

using namespace std;

int main(){

    double a, b, c, avg;
    cin>>a;
    cin>>b;
    cin>>c;
    avg = (a*2 + b*3 + c*5)/(2+3+5);
    cout<<"MEDIA = "<<FIXED_FLOAT(avg)<<endl;

    return 0;
}