#include<unistd.h>

int main() {
  // check to make sure c is working properly
  char *c = "c";
  char *c_path = getenv("PATH");
  char *c_path_c = strstr(c_path, c);
  if (c_path_c == NULL) {
    printf("c is not working properly\n");
    return 1;
  }
  printf("c is working properly\n");
}