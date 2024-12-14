#include <iostream>
using namespace std;

int main()
{
    int arr[20] = {1, 2, 2, 3};

    int arr1[] = {1, 2, 3, 4, 5};
    cout << size(arr)
         << endl;
    cout << (sizeof(arr) / sizeof(int));
    // cout << arr[4];
    return 0;
}