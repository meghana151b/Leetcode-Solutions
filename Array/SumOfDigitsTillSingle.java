//Sum of digits till it become single number
//Time Complexity:O(log n)
//Space Complexity:O(1)

class Main {
  public static int sumDigit(int n){
    while(n>9){
      int sum=0;
      while(n>0){
        sum += n%10;
        n /= 10;
      }
      n=sum;
    }
    return n;
  }
}
