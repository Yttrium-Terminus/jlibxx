#include "base.hpp"

inline string base::readFile(const string &fileName) {
  ifstream file(fileName);
  string content((istreambuf_iterator<char>(file)),
                 istreambuf_iterator<char>());
  file.close();
  return content;
}

inline bool base::isYes(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str == "yes" || str == "y";
}

inline bool base::isNo(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str == "no" || str == "n";
}

inline bool base::norYesOrNo(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str != "yes" && str != "y" && str != "no" && str != "n";
}

inline bool base::load() {
  try {
    error1 = base::readFile("./dialogs/error1.dialog");
    error2 = base::readFile("./dialogs/error2.dialog");
    error3 = base::readFile("./dialogs/error3.dialog");
    welcome = base::readFile("./dialogs/welcome.dialog");
    error0 = base::readFile("./dialogs/error0.dialog");
    invalid_in = base::readFile("./dialogs/inval_in.dialog");
    yesno = base::readFile("./dialogs/yn.dialog");
  } catch (...) {
    return false;
  }
  return true;
}
