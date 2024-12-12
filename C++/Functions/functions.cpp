#include <iostream>
using namespace std;

void printHello()
{
    cout << "hello";
}
int main()
{
    // swap two numbers without temp variables
    int a = 9;
    int b = 10;
    cout << a << " " << b << endl;
    ;
    // swap using bitwise operators
    a = a ^ b;
    b = b ^ a;
    a = a ^ b;
    cout << a << " " << b << endl;

    // functions.
    printHello();
    return 0;
}