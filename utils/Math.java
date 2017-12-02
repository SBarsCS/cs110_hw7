package utils;
public class Math{

public static int factorial (int num)
{
  if (num <= 1){
    return 1;
  }
  return num * factorial (num-1);
}
//for
public static int fact (int num){
for(int i=num-1;i>1;i--){
  num*=i;
}
return num;
}
}
