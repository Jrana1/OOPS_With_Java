#include <bits/stdc++.h>
using namespace std;
struct Point
{
    int i, j;
    Point(int x, int y) : i(x), j(y) {}
    int getI() { return i; }
    int getJ() { return j; }
};

void fun()
{
    vector<string> board = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    unordered_map<char, Point> mp(26);

    for (int i = 0; i < 3; i++)
    {

        for (int j = 0; j < board[i].size(); j++)
        {
            mp.insert({board[i][j], Point(i, j)});
        }
    }
    int n;
    cin >> n;
    vector<pair<string, int>> ans;
    while (n--)
    {

        string st;
        int l;
        cin >> st >> l;
        while (l--)
        {
            string str;
            cin >> str;
            int x = st.size();
            int dis = 0;
            for (int i = 0; i < x; i++)
            {
                auto ch1 = mp.find(st[i]);
                auto ch2 = mp.find(str[i]);
                dis += abs(ch1->second.getI() - ch2->second.getI()) + abs(ch1->second.getJ() - ch2->second.getJ());
                // cout << ch1->first << " " << ch1->second.getI() << " " << ch1->second.getJ() << endl;
            }
            ans.push_back({str, dis});
        }

        sort(ans.begin(), ans.end(), [](auto a, auto b) -> bool
             {
             
              if(a.second==b.second){
                return a.first<b.first;
              }
              return a.second<b.second; });

        for (auto x : ans)
        {
            cout << x.first << " " << x.second << endl;
        }
        ans.clear();
    }
}

int main()
{
    fun();
    return 0;
}