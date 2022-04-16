#include <iostream>
#include <fstream>
using namespace std;
int main () {
	string srg;
	ifstream filestream("C:\\Users\\Dharurkar\\Downloads\\ROHAN_IMPORTANT\\A_PG_DAC\\Programs\\C++_Programs\\test.txt");
	if (filestream.is_open()) {
		while ( getline (filestream,srg) ) {
			cout << srg <<endl;
		}
		filestream.close();
	} else {
		cout << "File opening is fail."<<endl;
	}
	return 0;
}