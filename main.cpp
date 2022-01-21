#include <iostream>

using namespace std;

int main()
{
   int sidea, sideb, sidec;
cout<<"input three sides of triangle:\n";
cin>>sidea>>sideb>>sidec;

if(sidea == sideb && sideb == sidec)
{
    cout<<"this is an equilateral triangle.\n";

}
else if(sidea == sideb || sidea == sidec || sideb== sidec)
{
    cout<<"this is an isosceles triangle.\n";
}
else{
    cout<<"this is a scalene trianglr.\n";
}

    return 0;
}