class BubbleSort{
    public static void main(String args[]){
        int a[]=new int[]{22,10,14,13,6,17};
        int n=a.length;
        System.out.println("Before Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");
        for(int k=0;k<n-1;k++){
            System.out.println("Pass "+k+" :");
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }
                
            }
        }
        System.out.println();
        System.out.println("After Swapping The Value : ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");

    }
}
