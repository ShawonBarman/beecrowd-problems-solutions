#include<bits/stdc++.h>

using namespace std;

int main(){
    int num;
    int total_positive = 0;
    int total_negative = 0;
    int total_even = 0;
    int total_odd = 0;
    for(int i = 0; i < 5; i++){
        cin >> num;
        if (num  > 0){
            total_positive += 1;
        }
        if (num < 0){
            total_negative += 1;
        }
        if (num % 2 == 0){
            total_even += 1;
        }
        if (num % 2 == 1){
            total_odd += 1;
        }
    }
    cout << total_even << " valor(es) par(es)" << endl;
    cout << total_odd << " valor(es) impar(es)" << endl;
    cout << total_positive << " valor(es) positivo(s)" << endl;
    cout << total_negative << " valor(es) negativo(s)" << endl;
    return 0;
}