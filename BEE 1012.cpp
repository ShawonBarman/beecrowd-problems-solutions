#include<iostream>

#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(3) << (x)

using namespace std;

int main(){
    float a, b, c;
    cin >> a >> b >> c;
    cout<<"TRIANGULO: "<<FIXED_FLOAT((1.0/2)*a*c)<<endl;
    cout<<"CIRCULO: "<<FIXED_FLOAT(3.14159*(c*c))<<endl;
    cout<<"TRAPEZIO: "<<FIXED_FLOAT((1.0/2)*(a+b)*c)<<endl;
    cout<<"QUADRADO: "<<FIXED_FLOAT(b*b)<<endl;
    cout<<"RETANGULO: "<<FIXED_FLOAT(a*b)<<endl;
    return 0;
}