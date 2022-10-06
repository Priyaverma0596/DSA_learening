public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int idx = -1;
    for (int i = 0; i < a.length; i++)
    {
      if (a[i] == data)
      {
        idx = i;
        break;
      }
    }

    System.out.println(idx);
  }
}