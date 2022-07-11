#include<iostream>
#include<iomanip>
#define FIXED_FLOAT(x) std::fixed << std::setprecision(1) << (x)

using namespace std;

int main(){
    float n1, n2, n3, n4, score;
    cin >> n1 >> n2 >> n3 >> n4;

    float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

    cout << "Media: " << FIXED_FLOAT(avg) << endl;

    if (avg >= 7){
        cout << "Aluno aprovado." << endl;
    }
    else if (avg < 5){
        cout << "Aluno reprovado." << endl;
    }
    else{
        cout << "Aluno em exame." << endl;
        cin >> score;
        cout << "Nota do exame: " << FIXED_FLOAT(score) << endl;
        float new_avg = (avg + score) / 2;
        if (new_avg >= 5){
            cout << "Aluno aprovado." << endl;
        }
        else{
            cout << "Aluno reprovado." << endl;
        }
        cout << "Media final: " << FIXED_FLOAT(new_avg) << endl;
    }
    return 0;
}