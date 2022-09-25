Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = sc.nextInt();

    }


    for (int i = 0; i < a.length; i++)
    {
      System.out.println(a[i]);
      for (int j = i + 1; j < a.length; i+1)
      {
        System.out.print(a[i]);
        System.out.print(a[j]);
      }
    }
  }