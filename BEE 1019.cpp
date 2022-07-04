#include<iostream>

using namespace std;

int main(){
    int num;
    cin >> num;
    int hour = num / 3600;
    int minute = (num % 3600) / 60;
    int second = (num % 3600) % 60;
    cout << hour << ":" << minute << ":" << second << endl;
    return 0;
}