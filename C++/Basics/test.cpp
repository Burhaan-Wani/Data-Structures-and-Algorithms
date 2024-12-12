#include <iostream>
#include <cmath>
using namespace std;

// check if a number is prime or not.
void isPrime(int n)
{
    if (n <= 1)
    {
        cout << "Number is not a prime" << endl;
        return;
    }
    bool prime = true;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            prime = false;
            break;
        }
    }
    if (prime == false)
    {
        cout << "number is not a prime no.";
    }
    else
    {
        cout << !prime << endl;
        cout << "number is prime";
    }
}

void countDigits(int n)
{
    int flag = 0;
    while (n > 0)
    {
        n /= 10;
        flag++;
    }
    cout << flag;
}

void sumOfDigits(int n)
{
    int sum = 0;

    while (n > 0)
    {
        int rem = n % 10;
        n /= 10;
        sum += rem;
    }
    cout << sum;
}

void reverseOfNumber(int n)
{
    int rev = 0;
    while (n > 0)
    {
        int rem = n % 10;
        n /= 10;
        rev = rev * 10 + rem;
    }
    cout << rev;
}

int main()
{
    // isPrime(9);
    // countDigits(9999);
    // sumOfDigits(7777);
    reverseOfNumber(1234);
    return 0;
}