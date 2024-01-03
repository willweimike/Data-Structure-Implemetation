#include <iostream>

using namespace std;

int main() {
    int M[3][3] = {
        {0, 2, 3},
        {2, 0, 3},
        {3, 2, 0}
    };
    for (int k = 1; k <= 3; k++) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                M[i][j] = min(M[i][j], M[i][k]+M[k][j]);
                cout << M[i][j] << endl;
            }
        }
    }
    return 0;
}
/*
void shortestPath() {
    int M[3][3] = {
        {0, 2, 3},
        {2, 0, 3},
        {3, 2, 0}
    };
    for (int k = 1; k <= 3; k++) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                M[i][j] = min(M[i][j], M[i][k]+M[k][j]);
                cout << M[i][j] << endl;
            }
        }
    }
}
*/
