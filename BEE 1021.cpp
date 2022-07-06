#include<iostream>
using namespace std;

int main(){
    double num;
    int a, b, res;
    cin >> num;
    a = num;
    cout << "NOTAS:" << endl;
    cout << a / 100 << " nota(s) de R$ 100.00" << endl;
    a = a % 100;
    cout << a / 50 << " nota(s) de R$ 50.00" << endl;
    a = a % 50;
    cout << a / 20 << " nota(s) de R$ 20.00" << endl;
    a = a % 20;
    cout << a / 10 << " nota(s) de R$ 10.00" << endl;
    a = a % 10;
    cout << a / 5 << " nota(s) de R$ 5.00" << endl;
    a = a % 5;
    cout << a / 2 << " nota(s) de R$ 2.00" << endl;
    a = a % 2;
    cout << "MOEDAS:" << endl;
    cout << a / 1 << " moeda(s) de R$ 1.00" << endl;
    b = num * 100;
    res = b % 100;
    cout << res / 50 << " moeda(s) de R$ 0.50" << endl;
    res = res % 50;
    cout << res / 25 << " moeda(s) de R$ 0.25" << endl;
    res = res % 25;
    cout << res / 10 << " moeda(s) de R$ 0.10" << endl;
    res = res % 10;
    cout << res / 5 << " moeda(s) de R$ 0.05" << endl;
    res = res % 5;
    cout << res / 1 << " moeda(s) de R$ 0.01" << endl;
    return 0;
}