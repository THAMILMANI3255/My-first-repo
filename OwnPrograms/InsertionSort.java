class InsertionSort{
    public static void main(String args[]){
        int a[]=new int[]{20,12,10,15,2};
        int n=a.length;
        System.out.println("Before Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else
                break;
            }
        }
        System.out.println();
        System.out.println("After Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");
    }
}
