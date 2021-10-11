#include <bits/stdc++.h>
using namespace std;

void insertionSort(int arr[], int n)
{
	int i, j, ele;
	for (i = 1; i < n; i++)
	{
		ele = arr[i];
		j = i - 1;
		while (j >= 0 && arr[j] > ele)
		{
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = ele;
	}
}

void display(int arr[], int n)
{
    cout<<endl;
	int i;
	for (i = 0; i < n; i++)
		cout << arr[i] << " ";
	cout << endl;
}


int main()
{
	int arr[5];
	int n = 5;
	cout<<"Enter the elements of array: "<<endl;
	for(int i=0;i<5;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<5;i++)
    {
        cout<<arr[i]<<" ";
    }

	insertionSort(arr, n);
	display(arr, n);

	return 0;
}


