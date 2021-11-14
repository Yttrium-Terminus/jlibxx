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

// test class
class Test
{
  // test function
public:
  void test()
  {
    // print out this program's memory address
    printf("%p\n", this);
  }

  // test friend
  friend void testFriend(Test *test);

  // test std::atomic
  std::atomic<int> testAtomic;

  // test std::thread
  std::thread testThread;
  // overload a thread
  void testThread(int i)
  {
    printf("%d\n", i);
  }
};

int main()
{
  // test GCC
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

  // test memory allocation
  int *p = new int;
  delete p;
  p = new int[10];
  delete[] p;

  // test heap memory
  int *q = (int *)malloc(sizeof(int));
  free(q);
  q = (int *)malloc(10 * sizeof(int));
  free(q);
  q = (int *)calloc(10, sizeof(int));
  free(q);
  q = (int *)realloc(q, 10 * sizeof(int));

  // test stack memory
  int r;
  int s;
  r = r + s;
  r = r - s;

  // test pointer arithmetic
  int *t = new int;
  int *u = new int;

  // test network byte order
  int v = 0x12345678;
  int w = 0x78563412;

  // test floating point
  float x = 0.0;
  float y = 1.0;
  float z = x + y;
  z = x - y;
  z = x * y;
  z = x / y;

  // test string
  char *str = "hello";
  char *str2 = "world";

  // test string concatenation
  char *str3 = str;

  // test heap allocation
  char *str4 = (char *)malloc(10);
  free(str4);
  str4 = (char *)malloc(10);
  free(str4);

  // test function call
  int (*pf)(int, int) = NULL;

  // hex dump
  char *buf = (char *)malloc(10);
  free(buf);

  // frexp alloc
  float *pf2 = (float *)malloc(sizeof(float));
  free(pf2);
}