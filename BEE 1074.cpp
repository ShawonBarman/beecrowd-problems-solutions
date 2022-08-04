#include<bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    for(int i = 0; i < n; i++){
        int num;
        cin >> num;
        if ((num % 2 == 0) && (num  > 0)){
            cout << "EVEN POSITIVE" << endl;
        }
        else if ((num % 2 == 0) && (num  < 0)){
            cout << "EVEN NEGATIVE" << endl;
        }
        else if ((num % 2 != 0) && (num  > 0)){
            cout << "ODD POSITIVE" << endl;
        }
        else if ((num % 2 != 0) && (num  < 0)){
            cout << "ODD NEGATIVE" << endl;
        }
        else{
            cout << "NULL" << endl;
        }
    }
    return 0;
}