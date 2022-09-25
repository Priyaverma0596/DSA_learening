public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n];
    int element=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
    if(element==a[i])
    {
        System.out.println(i);
        break;
    }
    }
    if(element!=a[i])
    {
        System.out.println("-1");
    }
 }

}