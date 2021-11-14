/**
 * Creates a stackdump
 */

#include <stdlib.h>
#include <iostream>
#include <atomic>
#include <thread>

#pragma warning(disable : 4996)
#pragma warning(disable : 4244)
#pragma warning(disable : 4305)
#pragma warning(disable : 4267)
#pragma GCC diagnostic ignored "-Wunused-parameter"
#pragma GCC diagnostic ignored "-Wunused-variable"
#pragma GCC diagnostic ignored "-Wpragmas"
#pragma GCC diagnostic ignored "-Wunused-function"
#pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#pragma GCC diagnostic ignored "-Wunused-but-set-parameter"
#pragma GCC diagnostic ignored "-Wwrite-strings"
#pragma GCC diagnostic ignored "-Wunused-local-typedefs"
#pragma GCC diagnostic ignored "-Wunused-but-set-label"
#pragma GCC diagnostic ignored "-Wunused-label"
#pragma CYG_ANNOT_CALL_CONVENTION
#pragma GCC diagnostic ignored "-Wmissing-field-initializers"
#pragma GCC diagnostic ignored "-Wmissing-braces"
#pragma GCC diagnostic ignored "-Wmissing-declarations"

class Test
{

public:
  void test()
  {

    printf("%p\n", this);
  }

  friend void testFriend(Test *test);

  std::atomic<int> testAtomic;

  std::thread testThread;
};

int main()
{

  int i = 0;
  int j = 0;
  i = i + j;
  i = i - j;
  i = i * j;
  i = i / j;
  i = i % j;
  i = i << j;
  i = i >> j;
  i = i & j;
  i = i | j;
  i = i ^ j;
  i = ~i;

  int *p = new int;
  delete p;
  p = new int[10];
  delete[] p;

  int *q = (int *)malloc(sizeof(int));
  free(q);
  q = (int *)malloc(10 * sizeof(int));
  free(q);
  q = (int *)calloc(10, sizeof(int));
  free(q);
  q = (int *)realloc(q, 10 * sizeof(int));

  int r;
  int s;
  r = r + s;
  r = r - s;

  int *t = new int;
  int *u = new int;

  int v = 0x12345678;
  int w = 0x78563412;

  float x = 0.0;
  float y = 1.0;
  float z = x + y;
  z = x - y;
  z = x * y;
  z = x / y;

  char *str = "hello";
  char *str2 = "world";

  char *str3 = str;

  char *str4 = (char *)malloc(10);
  free(str4);
  str4 = (char *)malloc(10);
  free(str4);

  int (*pf)(int, int) = NULL;

  char *buf = (char *)malloc(10);
  free(buf);

  float *pf2 = (float *)malloc(sizeof(float));
  free(pf2);

  Test test;
  test.test();
  test.testAtomic = 0;
  test.testAtomic++;
  test.testAtomic--;
  test.testAtomic += 1;
  test.testAtomic -= 1;
  test.testAtomic = test.testAtomic + 1;
  test.testAtomic = test.testAtomic - 1;
  test.testAtomic = test.testAtomic * 1;
  test.testAtomic = test.testAtomic / 1;
  test.testAtomic = test.testAtomic % 1;
  test.testAtomic = test.testAtomic << 1;
  test.testAtomic = test.testAtomic >> 1;
  test.testAtomic = test.testAtomic & 1;
  test.testAtomic = test.testAtomic | 1;
  test.testAtomic = test.testAtomic ^ 1;
  test.testAtomic = ~test.testAtomic;

  printf("%p\n", &i);
  printf("%p\n", &j);
  printf("%p\n", &r);
  printf("%p\n", &s);
  printf("%p\n", &x);
  printf("%p\n", &y);
  printf("%p\n", &z);
  printf("%p\n", &str);
  printf("%p\n", &str2);
  printf("%p\n", &str3);
  printf("%p\n", &str4);
  printf("%p\n", &pf);
  printf("%p\n", &pf2);
  printf("%p\n", &test);
  printf("%p\n", &test.testAtomic);
}