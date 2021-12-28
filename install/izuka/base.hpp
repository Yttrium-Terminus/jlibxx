
#ifndef BASE_HPP
#define BASE_HPP

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

namespace base {
  string readFile(const string &fileName);

  bool isYes(string &str);

  bool isNo(string &str);

  bool norYesOrNo(string &str);

  bool load();
}  // namespace base
#ifndef nl
#define nl "\n"
#endif

#endif