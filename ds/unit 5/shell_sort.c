#include <stdio.h>
void shellsort(int arr[], int num)
{
    int i, j, k, tmp, gap;
    for (gap = num / 2; gap > 0; gap = gap / 2)
    {
        for (j = gap; j < num; j++)
        {
            for (i = j - gap; i >= 0; i = i - gap)
            {
                if (arr[i + gap] >= arr[i])
                    break;
                else
                {
                    tmp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = tmp;
                }
            }
        }
    }
}
void main()
{
    int arr[30];
    int k, num;
    clrscr();
    printf("Enter total no. of elements : ");
    scanf("%d", &num);
    printf("\nEnter %d numbers: ", num);
    for (k = 0; k < num; k++)
    {
        scanf("%d", &arr[k]);
    }
    shellsort(arr, num);
    printf("\n Sorted array is: ");
    for (k = 0; k < num; k++)
        printf("%d ", arr[k]);
}