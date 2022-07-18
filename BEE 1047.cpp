#include<bits/stdc++.h>

using namespace std;

int main(){
    int h1, m1, h2, m2, total_hour, total_minute;
    cin >> h1 >> m1 >> h2 >> m2;
    if ((h1 == h2) && (m1 == m2)){
        total_hour = (24 - h1) + h2;
        total_minute = m2 - m1; 
    }
    else if ((h1 == h2) && (m1 < m2)){
        total_hour = h2 - h1;
        total_minute = m2 - m1; 
    }
    else if ((h1 == h2) && (m1 > m2)){
        total_hour = (24 - h1) + h2 - 1;
        total_minute = (60 - m1) + m2; 
    }
    else if ((h1 < h2) && (m1 == m2)){
        total_hour = h2 - h1;
        total_minute = m2 - m1;
    }
    else if ((h1 > h2) && (m1 == m2)){
        total_hour = (24 - h1) + h2;
        total_minute = m2 - m1;
    }
    else if ((h1 < h2) && (m1 < m2)){
        total_hour = h2 - h1;
        total_minute = m2 - m1;
    }
    else if ((h1 < h2) && (m1 > m2)){
        total_hour = h2 - h1 - 1;
        total_minute = (60 - m1) + m2;
    }
    else if ((h1 > h2) && (m1 < m2)){
        total_hour = (24 - h1) + h2 - 1;
        total_minute = m2 - m1;
    }
    else{
        total_hour = (24 - h1) + h2 - 1;
        total_minute = (60 - m1) + m2;
    }
    cout << "O JOGO DUROU " << total_hour << " HORA(S) E " << total_minute << " MINUTO(S)" << endl;
    return 0;
}