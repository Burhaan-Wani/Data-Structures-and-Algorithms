#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int num = 36;
    vector<int> vec;

    for (int i = 1; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            vec.emplace_back(i);
            if ((num / i) != i)
            {
                vec.emplace_back(num / i);
            }
        }
    }
    sort(vec.begin(), vec.end());

    for (auto val : vec)
    {
        cout << val << " ";
    }
    return 0;
}