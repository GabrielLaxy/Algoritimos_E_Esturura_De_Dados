#include <stdio.h>
#include <limits.h>

float fat (int n) {
    int i;
    float f;
    for (i=2, f=1; i <= n; i++)
        f *= i;
    return f;
}

int fat_rec (int n) {
    if (n <= 1) return 1;
    return n * fat_rec(n-1);
}

int main () {
    //printf ("maior inteiro: %d\n", INT_MAX);
    // for (int i=1; i <= 13; i++)
    //     printf ("fatorial de %d = %.0f\n", i, fat(i));
    for (int i=1; i < 13; i++)
        printf ("fatorial de %d = %d\n", i, fat_rec(i));
    return 0;
}