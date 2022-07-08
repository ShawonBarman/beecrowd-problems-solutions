#include <iostream>
#include <iomanip>
#include <cmath>

#define FIXED_FLOAT(x) std::fixed << std::setprecision(5) << (x)

using namespace std;

int main() {
	
    double A, B, C, R1, R2, root;
    cin >> A >> B >> C;
    
    root = (B * B - 4 * A * C);
    
    if(A != 0 && root > 0)
    {
        R1 = (- B + sqrt(root)) / (2 * A);
        R2 = (- B - sqrt(root)) / (2 * A);
        
        cout << "R1 = " << FIXED_FLOAT(R1) << endl;
        cout << "R2 = " << FIXED_FLOAT(R2) << endl;
    }
    else
       cout << "Impossivel calcular" << endl;
    
    return 0;
}