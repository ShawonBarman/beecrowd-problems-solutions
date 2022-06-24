#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)
using namespace std;
int main(){
    char name[100];
    float fixed_salary, total_sale;
    cin>>name;
    cin>>fixed_salary;
    cin>>total_sale;
    cout<<"TOTAL = R$ "<<FIXED_FLOAT(fixed_salary+(total_sale*0.15))<<endl;
    return 0;
}