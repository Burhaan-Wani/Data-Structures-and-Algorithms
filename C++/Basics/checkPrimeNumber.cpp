#include <iostream>

using namespace std;

int main()
{
    int num = 36;
    int count = 0;
    for (int i = 1; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            count++;
            if ((num / i) != i)
            {
                count++;
            }
        }
    }
    if (count == 2)
        cout << "true";
    else
        cout << "false";

    return 0;
}