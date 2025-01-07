// Online C++ compiler to run C++ program online
#include <iostream>

int main() {
    int numbers[6] = {1,1,3,4,5,5};
    int max = -1;
    
    for(int i=0;i<numbers.size();i++){
        for(int j=i+1;j<numbers.size();j++){
            if(numbers[i] == numbers[j]){
                 if (max < numbers[i]) {
                        max = numbers[i];
                    }
            }
        }
    }
    cout<<max;
    return 0;
}