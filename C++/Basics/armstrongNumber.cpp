#include <iostream>
using namespace std;
int main()
{
    int num = 7789;
    int dub = num;
    int sum = 0;
    while (num > 0)
    {
        int rem = num % 10;
        sum = sum + (rem * rem * rem);
        num /= 10;
    }
    if (sum == dub)
        cout << "true";
    else
        cout << "true";
    return 0;
}