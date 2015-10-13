int i = 0;
int arr[] = { 3, 7,-12, 8, -1, 6, -6, 5, -2};
int j = arr.length - 1;
while (true) {
    if (arr[i] > 0) {
        ++i; 
    }
    if (arr[j] < 0) {
        --j;
    }
    if (i > j) 
        break; 
    if (arr[i] < 0 && arr[j] > 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]);
        }
