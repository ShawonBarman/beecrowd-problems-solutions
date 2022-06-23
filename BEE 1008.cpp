#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)
using namespace std;
int main(){
    int num, working_hour;
    float hour_rate;
    cin>>num;
    cin>>working_hour;
    cin>>hour_rate;
    cout<<"NUMBER = "<<num<<endl;
    cout<<"SALARY = U$ "<<FIXED_FLOAT(working_hour*hour_rate)<<endl;
    return 0;
}