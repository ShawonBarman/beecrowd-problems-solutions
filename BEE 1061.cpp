#include<bits/stdc++.h>

using namespace std;

int main(){
    char str1[5], str2[5], str3[2], str4[2], str5[2], str6[2];
    int day1, day2, hour1, hour2, minute1, minute2, second1, second2;
    cin >> str1 >> day1;
    cin >> hour1 >> str3 >> minute1 >> str4 >> second1;
    cin >> str2 >> day2;
    cin >> hour2 >> str5 >> minute2 >> str6 >> second2;
    int total_first_day = (day1 * 24 * 3600) + (hour1 * 3600) + (minute1 * 60) + second1;
    int total_second_day = (day2 * 24 * 3600) + (hour2 * 3600) + (minute2 * 60) + second2;
    int diff = total_second_day - total_first_day;
    int d = diff / (24 * 3600);
    int h = (diff % (24 * 3600)) / 3600;
    int m = ((diff % (24 * 3600)) % 3600) / 60;
    int s = ((diff % (24 * 3600)) % 3600) % 60;
    cout << d << " dia(s)" << endl;
    cout << h << " hora(s)" << endl;
    cout << m << " minuto(s)" << endl;
    cout << s << " segundo(s)" << endl;
    return 0;
}