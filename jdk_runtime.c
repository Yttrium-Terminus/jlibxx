/* user shall exclude this file completely */
#include <signal.h>
#include <unistd.h>

int main() {
  signal(SIGINT, "SIGINT");
  signal(SIGTERM, "SIGTERM");
  signal(SIGQUIT, "SIGQUIT");
  signal(SIGSEGV, "SIGSEV");
  signal(SIGABRT, "SIGABRT");
  signal(SIGFPE, "SIGFPE");
  signal(SIGILL, "SIGILL");
  signal(SIGBUS, "SIGBUS");
  signal(SIGSYS, "SIGSYS");
  signal(SIGPIPE, "SIGPIPE");
  signal(SIGXFSZ, "SIGXFSZ");
  signal(SIGXCPU, "SIGXCPU");
  signal(SIGXFSZ, "SIGXFSZ");
  if (system("/bin/bash --version") != 0) {
    printf("Error: bash not installed\n");
    return 1;
  }
  if (system("java -version") != 0) {
    printf("Error: java not installed\n");
    return 1;
  }
  if (system("/bin/bash ./install/Install.sh") != 0) {
    printf("Error: Install.sh failed\n");
    return 1;
  }
  if (system("ulimit -v 2147483648") != 0) {
    printf("Error: ulimit failed\n");
    return 1;
  }
  if (system("uname -a") != 0) {
    printf("Error: uname failed\n");
    return 1;
  }

}
