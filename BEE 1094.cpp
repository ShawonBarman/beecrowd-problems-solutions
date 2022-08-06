#include<bits/stdc++.h>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    int n;
    cin >> n;
    int total = 0;
    int c = 0;
    int r = 0;
    int s = 0; 
    for (int i = 0; i < n; i++){
        int amount;
        char name;
        cin >> amount >> name;
        if (name == 'C'){
            c += amount;
        }
        else if (name == 'R'){
            r += amount;
        }
        else{
            s += amount;
        }
        total += amount;
    }
    cout << "Total: " << total << " cobaias" << endl;
    cout << "Total de coelhos: " << c << endl;
    cout << "Total de ratos: " << r << endl;
    cout << "Total de sapos: " << s << endl;
    cout << "Percentual de coelhos: " << FIXED_FLOAT(((1.0 * c) / total) * 100) << " %" << endl;
    cout << "Percentual de ratos: " << FIXED_FLOAT(((1.0 * r) / total) * 100) << " %" << endl;
    cout << "Percentual de sapos: " << FIXED_FLOAT(((1.0 * s) / total) * 100) << " %" << endl;
    return 0;
}