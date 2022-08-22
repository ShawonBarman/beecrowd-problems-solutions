#include<bits/stdc++.h>

using namespace std;

int main(){
    int grenais = 0;
    int inter = 0;
    int gremio = 0;
    int empates = 0;
    while (1)
    {
        int i, g;
        cin >> i >> g;
        grenais += 1;
        if (i > g)
        {
            inter += 1;
        }
        else if (i < g)
        {
            gremio += 1;
        }
        else
        {
            empates += 1;
        }
        cout << "Novo grenal (1-sim 2-nao)" << endl;
        int n;
        cin >> n;
        if (n == 2)
        {
            break;
        }
    }
    cout << grenais << " grenais" << endl;
    cout << "Inter:" << inter << endl;
    cout << "Gremio:" << gremio << endl;
    cout << "Empates:" << empates << endl;
    if (inter > gremio)
    {
        cout << "Inter venceu mais" << endl;
    }
    else if (inter < gremio)
    {
        cout << "Gremio venceu mais" << endl;
    }
    else
    {
        cout << "Nao houve vencedor" << endl;
    }
    
    return 0;
}