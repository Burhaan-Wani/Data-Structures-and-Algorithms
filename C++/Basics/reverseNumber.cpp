#include <iostream>
using namespace std;

int main()
{
    int num = 7789;
    int sum = 0;
    while (num > 0)
    {
        int rem = num % 10;
        sum = (sum * 10) + rem;
        num /= 10;
    }
    cout << sum;
    return 0;
}