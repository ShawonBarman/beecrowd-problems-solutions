#include <bits/stdc++.h>

using namespace std;

int main(){
    int x = 7;
    for (int i = 1; i < 10; i += 2){
        for (int j = x; j > (x - 3); j--){
            cout << "I=" << i << " J=" << j << endl;
        }
        x += 2;
    }
    return 0;
}