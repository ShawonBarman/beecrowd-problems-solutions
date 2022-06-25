#include<iostream>

#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    int p1, p2, u1, u2;
    float price1, price2;
    cin>>p1>>u1>>price1;
    cin>>p2>>u2>>price2;
    cout<<"VALOR A PAGAR: R$ "<<FIXED_FLOAT((u1*price1)+(u2*price2))<<endl;
    return 0;
}