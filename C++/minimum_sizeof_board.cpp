#include<bits/stdc++.h>
using namespace std;
    int main(int argc, char const *argv[]) {
	int n, k, cnt = 1, dim = 1;
	cin >> n >> k;
//	assert(n >= 1 && n <= 1000000);
//	assert(k >= 1 && k <= 1000000);
	for (int i = 1; cnt < n; i ++) {
		dim = dim + k;
	//	cout<<dim<<endl;
		cnt = cnt + (1 + i * 2);
		
	}
	cout << dim;
	return 0;

}