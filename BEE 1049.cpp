#include<bits/stdc++.h>

using namespace std;

int main(){
    char a[22], b[22], c[22];
    cin>> a;
    if(strcmp(a, "vertebrado") == 0){
        cin>>b;
        if(strcmp(b, "ave") == 0){
            cin>>c;
            if(strcmp(c, "carnivoro") == 0)
                cout<<"aguia"<<endl;
            else if(strcmp(c, "onivoro") == 0)
                cout<<"pomba"<<endl;
        }
        if(strcmp(b, "mamifero") == 0){
            cin>>c;
            if(strcmp(c, "onivoro") == 0)
                cout<<"homem"<<endl;
            else if(strcmp(c, "herbivoro") == 0)
                cout<<"vaca"<<endl;
        }
    }
    else if(strcmp(a, "invertebrado") == 0){
        cin>>b;
        if(strcmp(b, "inseto") == 0){
            cin>>c;
            if(strcmp(c, "hematofago") == 0)
                cout<<"pulga"<<endl;
            else if(strcmp(c, "herbivoro") == 0)
                cout<<"lagarta"<<endl;
        }
        if(strcmp(b, "anelideo") == 0){
            cin>>c;
            if(strcmp(c, "hematofago") == 0)
                cout<<"sanguessuga"<<endl;
            else if(strcmp(c, "onivoro") == 0)
                cout<<"minhoca"<<endl;
        }
    }
    return 0;
}