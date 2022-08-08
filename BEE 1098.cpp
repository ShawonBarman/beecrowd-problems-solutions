#include <bits/stdc++.h>

using namespace std;

int main(){
    for (float i = 0; i <= 2.01; i += 0.2){
        for (int j = 1; j < 4; j ++){
            cout << "I=" << i << " J=" << j+i << endl;
        }
    }
    return 0;
}