#include<bits/stdc++.h>

using namespace std;

int main(){
    double a, b, c;
    cin >> a >> b >> c;
    double arr[] = {a, b, c};
    sort(arr, arr+3);
    a = arr[2];
    b = arr[1];
    c = arr[0];
    if (a >= (b + c)){
        cout << "NAO FORMA TRIANGULO" << endl;
    }
    else if ((a * a) == ((b * b) + (c * c))){
        cout << "TRIANGULO RETANGULO" << endl;
    }
    else if ((a * a) > ((b * b) + (c * c))){
        cout << "TRIANGULO OBTUSANGULO" << endl;
    }
    else if ((a * a) < ((b * b) + (c * c))){
        cout << "TRIANGULO ACUTANGULO" << endl;
    }

    if (a == b && a == c){
        cout << "TRIANGULO EQUILATERO" << endl;
    }
    if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
        cout << "TRIANGULO ISOSCELES" << endl;
    }
    return 0;
}