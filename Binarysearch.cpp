#include<iostream>
using namespace std;
int main()
{
    int i,arr[5], num, L, U, M;
    cout<<"Enter the Elements (in ascending order): "<<endl;
    for(i=0; i<5; i++)
        cin>>arr[i];
    cout<<"Enter Element to be Search: "<<endl;
    cin>>num;
    L = 0;
    U = 4;
    M = (L+U)/2;
    while(L <= M)
    {
        if(arr[M]<num)
            L = M+1;
        else if(arr[M]==num)
        {
            cout<<"The number, "<<num<<" found at index "<<M<<endl;
            break;
        }
        else
            U = M-1;
        M= (L+U)/2;
    }
    if(L>M)
        cout<<"The number, "<<num<<" is not found in given Array"<<endl;
    cout<<endl;
    return 0;
}
