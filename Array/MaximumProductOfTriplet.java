//Program:Maximum Product of Triplet
//Time Complexity:O(n)
//Space Complexity:O(1)

class Maximum{
  public static int maxProduct(int[] arr){
    int maxA=Integer.MIN_VALUE;
    int maxB=Integer.MIN_VALUE;
    int maxC=Integer.MIN_VALUE;

    int minA=Integer.MAX_VALUE;
    int minB=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]>maxA){
        maxC=maxB;
        maxB=maxA;
        maxA=arr[i];
      }
      else if(arr[i]>maxB){
        maxC=maxB;
        maxB=arr[i];
      }
      else if(arr[i]>maxC){
        maxC=arr[i];
      }
      if(arr[i]<minA){
        minB=minA;
        minA=arr[i];
      }
      else if(arr[i]<minB){
        minB=arr[i];
      }
    }
    return Math.max(minA*minB*maxA,maxA*maxB*maxC);
    
  }
}
