#include <iostream>
using namespace std;

int main()
{
    int num = 121;
    int dub = num;
    int sum = 0;
    while (num > 0)
    {
        int rem = num % 10;
        sum = (sum * 10) + rem;
        num /= 10;
    }
    if (sum == dub)
        cout << "true";
    else
        cout << "false";
    return 0;
}