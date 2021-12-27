#pragma once
#pragma GCC diagnostic ignored "-Wreturn-type"

#include <algorithm>
#include <cctype>
#include <cstdio>
#include <fstream>
#include <iostream>
#include <string>

#ifndef speed
#define speed                  \
  ios::sync_with_stdio(false); \
  cin.tie(0);                  \
  cout.tie(0)
#endif

#ifndef elif
#define elif else if
#endif

using namespace std;

string error1 = "";
string error2 = "";
string error3 = "";
string welcome = "";
string error0 = "";
string invalid_in = "";
string yesno = "";

string readFile(const string &fileName) {
  ifstream file(fileName);
  string content((istreambuf_iterator<char>(file)),
                 istreambuf_iterator<char>());
  return content;
}

bool isYes(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str == "yes" || str == "y";
}

bool isNo(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str == "no" || str == "n";
}

bool norYesOrNo(string &str) {
  transform(str.begin(), str.end(), str.begin(), ::tolower);
  return str != "yes" && str != "y" && str != "no" && str != "n";
}

bool load() {
  try {
    error1 = readFile("./dialogs/error1.dialog");
    error2 = readFile("./dialogs/error2.dialog");
    error3 = readFile("./dialogs/error3.dialog");
    welcome = readFile("./dialogs/welcome.dialog");
    error0 = readFile("./dialogs/error0.dialog");
    invalid_in = readFile("./dialogs/inval_in.dialog");
    yesno = readFile("./dialogs/yn.dialog");
  } catch (...) {
    return false;
  }
  return true;
}

#ifndef load
#define load load()
#endif

#ifndef nl
#define nl "\n"
#endif
