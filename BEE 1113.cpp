#include<bits/stdc++.h>

using namespace std;

int main(){
    while(1){
        int x, y;
        cin >> x >> y;
        if (x == y){
            break;
        }

        if (x > y){
            cout << "Decrescente" << endl;
        }
        else{
            cout << "Crescente" << endl;
        }
    }
    return 0;
}