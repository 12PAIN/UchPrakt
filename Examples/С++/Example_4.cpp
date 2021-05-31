#include <iostream>

using namespace std;

void func_A() {
    cout << "Func_A is called";
}

int main()
{
    
    int i = 0;

    cout << "i=" << i;

    for (; i < 10;) {
        i += 1;
    }

    cout << "End i = " << i;

    return 0;
}
