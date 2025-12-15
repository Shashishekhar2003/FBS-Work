#include <stdio.h>

void fun1(int, int, int, char, double, float);               //Decl
void fun2(int, char, char, double, int, int, float);
void fun3(int, int, char, float);

void main()
{
    int a = 10, b = 20, c;
    char ch = 'x';
    double y = 10.2;
    float f = 3.2;

    fun1(a, b, c, ch, y, f);                                  //Call
    fun2(a + b, 'c', 'y', y + 2, 10, 15, 3.2);
    fun3(5 * 2 + 4, a * 3, 'f', 20.8);
}

void fun1(int a, int b, int c, char ch, double e, float f)    //Def
{
}

void fun2(int g, char h, char i, double j, int k, int l, float m)
{
}

void fun3(int n, int o, char p, float q)
{
}