#include <stdio.h>
int main() {
  int rows, cols, matrix[50][50];
  int zeroCount = 0;
  printf("Enter the number of rows and columns of the matrix: ");
  scanf("%d %d", &rows, &cols);
  printf("Enter the elements of the matrix:\n");
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      scanf("%d", &matrix[i][j]);
      if (matrix[i][j] == 0) {
        zeroCount++;
      }
    }
  }
  int totalElements = rows * cols;
  if (zeroCount > totalElements / 2) {
    printf("The matrix is sparse.\n");
  } else {
    printf("The matrix is not sparse.\n");
  }
  return 0;
}