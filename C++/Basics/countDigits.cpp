#include <iostream>

using namespace std;

int main()
{
    int num = 7765;
    int count = 0;
    while (num > 0)
    {
        count++;
        num /= 10;
    }
    cout << count;
    return 0;
}