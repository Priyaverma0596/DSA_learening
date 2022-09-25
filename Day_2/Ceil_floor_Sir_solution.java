nt n = sc.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int low = 0;
    int high = a.length - 1;
    int ceil = 0;
    int floor = 0;
    while (low <= high)
    {
      int mid = (low + high) / 2;
      if (data < a[mid])
      {
        high = mid - 1;
        ceil = a[mid];
      }
      else if (data > a[mid])
      {
        low = mid + 1;
        floor = a[mid];
      }
      else{
          ceil=a[mid];
          floor=a[mid];
          break;
      }

    }
    System.out.println(ceil);
    System.out.println(floor);
  }
}