#include<iostream>

using namespace std;

int main(){
    int num;
    cin >> num;
    int year = num / 365;
    int month = (num % 365) / 30;
    int day = (num % 365) % 30;
    cout << year << " ano(s)" << endl;
    cout << month << " mes(es)" << endl;
    cout << day << " dia(s)" << endl;
    return 0;
}