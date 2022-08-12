#include<bits/stdc++.h>

using namespace std;

int main(){
    while(1){
        int password;
        cin >> password;
        if (password == 2002){
            cout << "Acesso Permitido" << endl;
            break;
        }
        else{
            cout << "Senha Invalida" << endl;
        }
    }
    return 0;
}