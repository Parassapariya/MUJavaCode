#include <stdio.h>
#define TABLE_SIZE 10
int hashFunction(int key)
{
    return key % TABLE_SIZE;
}
void insert(int hashTable[], int key)
{
    int index = hashFunction(key);
    while (hashTable[index] != -1)
    {
        index = (index + 1) % TABLE_SIZE;
    }
    hashTable[index] = key;
}
void display(int hashTable[])
{
    for (int i = 0; i < TABLE_SIZE; i++)
    {
        if (hashTable[i] != -1)
        {
            printf("Index %d: %d\n", i, hashTable[i]);
        }
        else
        {
            printf("Index %d: Empty\n", i);
        }
    }
}
int main()
{
    int hashTable[TABLE_SIZE];
    for (int i = 0; i < TABLE_SIZE; i++)
    {
        hashTable[i] = -1;
    }
    int keys[] = {23, 43, 13, 27, 56, 72, 91};
    int n = sizeof(keys) / sizeof(keys[0]);
    for (int i = 0; i < n; i++)
    {
        insert(hashTable, keys[i]);
    }
    display(hashTable);
    return 0;
}