static long solve(int k, long n)
    {

  //  System.out.println("Entered Solve function");
  char[] c = new char[4];

  long sum = 0;
  char[] cf = {};

  for(long i=2;i<=n;i++)
  {

      cf = fromDeci(c, k, i);
      String str = String.valueOf(cf);


       //System.out.println(snew);
       sum = sum + str.length() ;
    }

  return sum;
    }
