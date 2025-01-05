#include <iostream>

int main() {
    int T;
    std::cin >> T;
    while (T--) {
        int n, t, k;
        std::cin >> n >> t >> k;

        bool flag = false;
        for (int x = 1; x < n; x++) {
            for (int y = 1; y < n; y++) {
                if (x != y && (x % k) + (y % k) == t) {
                    flag = true;
                    break;
                }
            }
            if (flag) break; // Break outer loop if flag is true
        }

        if (!flag) std::cout << "NO" << std::endl;
        else std::cout << "YES" << std::endl;
    }
    return 0;
}

