class NextLargest{
    public static void main(String args[]){
        int a[]=new int[]{1,3,2,4};
        int n=a.length;
        int j=1;
        System.out.print("The Original Arrays iS : ");
        for(int m=0;m<n;m++){
            System.out.print(a[m]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(j==n){
                a[i]=-1;
                j--;
            }
            else if(a[i]<a[j]){
                a[i]=a[j];
                j++;
            }
            else if(a[j]==0){
                a[i]=-1;
                j++;
            }
            else if(a[i]>a[j]){
                j=j+1;
                if(a[i]<a[j]){
                    a[i]=a[j];
                }
            }
        }
        System.out.print("The Modified Arrays iS : ");
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
}