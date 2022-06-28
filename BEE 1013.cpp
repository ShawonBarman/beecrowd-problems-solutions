#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int a, b, c;
    cin >> a >> b >> c;
    int maiorAB = (a+b+abs(a-b))/2;
    int greatestValue = (maiorAB+c+abs(maiorAB-c))/2;
    cout<<greatestValue<<" eh o maior"<<endl;
    return 0;
}