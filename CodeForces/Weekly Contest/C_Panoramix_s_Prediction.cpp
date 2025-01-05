#include<bits/stdc++.h> 

using namespace std; 

int main(){
    int n, m; 
    cin >> n >> m; 

    int nextPrime = -1; 
    for(int i = n + 1; i <= 50; i++){
        int count = 0; 

        for(int j = 1; j <= i; j++){
            if(i % j == 0)count++; 
        }

        if(count == 2){
            nextPrime = i; 
            break;
        }
    }

    if(nextPrime == m){
        cout << "YES" << endl;
    }
    else cout << "NO" << endl;
    return 0;
}