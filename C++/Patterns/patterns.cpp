#include <iostream>
using namespace std;

void pattern1(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << j + 1 << " ";
        }
        cout << endl;
    }
}

void pattern2(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "*" << " ";
        }
        cout << endl;
    }
}

void pattern3(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i; j++)
        {
            cout << "*" << " ";
        }
        cout << endl;
    }
}

void pattern4(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << j + 1 << " ";
        }
        cout << endl;
    }
}

void pattern5(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << (2 * j) + 1 << " ";
        }
        cout << endl;
    }
}

void pattern6(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (char ch = 'A'; ch < 'A' + n; ch++)
        {
            cout << ch << " ";
        }
        cout << endl;
    }
}

void pattern7(int n)
{
    int mid = n / 2 + 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == mid || j == mid)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }
}

void pattern8(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == j || i + j == n + 1)
                cout << "*";
            else
                cout << " ";
        }
        cout << endl;
    }
}

void pattern9(int n)
{
    int k = 1;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << k << " ";
            k++;
        }
        cout << endl;
    }
}

void pattern10(int n)
{
    for (int i = 1; i <= n; i++)
    {
        int start = i % 2 != 0 ? 1 : 0;
        for (int j = 1; j <= i; j++)
        {
            cout << start;
            if (start == 1)
                start = 0;
            else
                start = 1;
        }
        cout << endl;
    }
}

void pattern11(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        for (int k = 0; k <= i; k++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void pattern12(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        for (int k = 0; k <= i; k++)
        {
            cout << k + 1;
        }
        cout << endl;
    }
}

void pattern13(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        for (int k = 0; k < n; k++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void pattern14(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        for (int k = 0; k < (2 * i) + 1; k++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

// pattern14, 15 and 16 are same, but created in different ways.
void pattern15(int n)
{
    int a = 1;
    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < n - i - 1; k++)
        {
            cout << " ";
        }
        for (int j = 0; j < a; j++)
        {
            cout << "*";
        }
        a += 2;
        cout << endl;
    }
}

void pattern16(int n)
{
    int nsp = n - 1;
    int nst = 1;
    for (int i = 1; i <= n; i++)
    {
        // spaces
        for (int j = 1; j <= nsp; j++)
        {
            cout << " ";
        }
        // stars
        for (int k = 1; k <= nst; k++)
        {
            cout << "*";
        }
        nsp--;
        nst += 2;
        cout << endl;
    }
}

void pattern17(int n)
{
    for (int i = 0; i < n; i++)
    {
        // spaces
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        // numbers
        for (int k = 0; k <= i; k++)
        {
            cout << k + 1;
        }
        // numbers
        for (int l = i; l > 0; l--)
        {
            cout << l;
        }
        cout << endl;
    }
}

void pattern18(int n)
{
    int nst = 1;
    int nsp = n - 1;
    for (int i = 1; i <= 2 * n - 1; i++)
    {
        // spaces
        for (int j = 1; j <= nsp; j++)
        {
            cout << " ";
        }
        // stars
        for (int k = 1; k <= nst; k++)
        {
            cout << "*";
        }
        if (i <= n - 1)
        {
            nsp--;
            nst += 2;
        }
        else
        {
            nsp++;
            nst -= 2;
        }
        cout << endl;
    }
}

int main()
{
    int n;
    cout << "Enter number of rows: ";
    cin >> n;
    pattern18(n);
    return 0;
}