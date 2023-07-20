class SelectionSort{
    public static void main(String args[]){
        int a[]=new int[]{20,12,10,15,2};
        int n=a.length;
        System.out.println("Before Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");

        for(int i=0;i<n;i++){
            int min=a[i];
            int minindex=i;
            for(int j=i;j<n;j++){
                if(a[j]<min){
                    min=a[j];
                minindex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;            
        }
           
        System.out.println();
        System.out.println("After Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");
    }
}
