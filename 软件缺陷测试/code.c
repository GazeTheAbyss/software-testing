#include <klee/klee.h>

struct
{
    int id[3];
    char name[5];
    int money[6];
    char type[3];
}base[2];

void test1(int x) {
    int *ptr;
    if (ptr == &x) {
        x = 1;
    }
}

void test2(int x) {
    int a[x];
    for(int i = 0; i <= x; i++) {
        a[i] = i;
    }
}

void test3(int x) {
    int b = 1, c;
    c = b / x;
}

void test4(int x) {
    int b = 2;
    x = b;
    test5();
}

void test(int* err) {
    test1(err[0]);
    test2(err[1]);
    test3(err[2]);
    test4(err[3]);
}

#define SIZE 4

int main() {
    int err[SIZE];
    klee_make_symbolic(err, sizeof err, "err");
    test(err);
    return 0;
}