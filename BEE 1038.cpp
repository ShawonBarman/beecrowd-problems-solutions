#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(2) << (x)

using namespace std;

int main(){
    int code, items;
    cin >> code >> items;
    if (code == 1){
        cout << "Total: R$ " << FIXED_FLOAT(4.0 * items) << endl;
    }
    else if (code == 2){
        cout << "Total: R$ " << FIXED_FLOAT(4.50 * items) << endl;
    }
    else if (code == 3){
        cout << "Total: R$ " << FIXED_FLOAT(5.0 * items) << endl;
    }
    else if (code == 4){
        cout << "Total: R$ " << FIXED_FLOAT(2.0 * items) << endl;
    }
    else if (code == 5){
        cout << "Total: R$ " << FIXED_FLOAT(1.5 * items) << endl;
    }
    return 0;
}