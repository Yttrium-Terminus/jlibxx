#include "izuka_base.hpp"

using namespace std;

int main() {
  speed;
  if (!load) {
    cout << "**Invalid Resources!\nPlease make sure you have everything "
            "installed properly...\nError Code: 4\n\nExitting..."
         << endl;
    return 4;
  } else {
    cout << welcome << endl;

    string option = "";
    cin >> option;
    while (norYesOrNo((option))) {
      cout << nl << nl << invalid_in << endl;
      cout << yesno << endl;
      option = "";
      cin >> option;
      if (isYes(option)) cout << "w" << endl;
      elif (isNo(option)) cout << error0 << endl;
      elif (option == "exit" || option == "quit") return 0;
    }
  }
}