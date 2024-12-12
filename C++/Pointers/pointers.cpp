#include <iostream>
using namespace std;

int main()
{
    // star operator in context to pointers is known as dereference operator.
    // int x = 12;
    // int *p = &x; // this is a pointer.
    // cout << &x << " " << p << endl;

    // sum of two number suing pointers

    int x = 12;
    int y = 12;
    int *p1 = &x;
    int *p2 = &y;
    int sum = *p1 + *p2;
    cout << sum;
    return 0;
}