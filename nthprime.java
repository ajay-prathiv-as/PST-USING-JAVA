import java.util.*;
import java.io.*;
class UserMainCode{
  public int NthPrime(int input){
    int count = 0, num = 2;
      while (true) {
          boolean isPrime = true;
          for (int i = 2; i * i <= num; i++) {
              if (num % i == 0) {
                  isPrime = false;
                  break;
              }
          }
          if (isPrime) {
              count++;
              if (count == input1)
                  return num;
          }
          num++;
      }
  }
}
