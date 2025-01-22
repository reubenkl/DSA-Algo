package problems;

public class ExactlyThreeDivisors {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(exactly3Divisors(N));

    }

    public static int exactly3Divisors(int N)
    {
        //Your code here

        int count = 0;
        int limit = (int)Math.sqrt(N);
        boolean[] isPrime = new boolean[limit+1];
        for(int i = 2;i<=limit;i++){
            isPrime[i]=true;
        }
        for(int i = 2;i*i<=limit;i++){
            if(isPrime[i]){
                for(int j =i*i;j<=limit;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i = 2;i<=limit;i++){
            if(isPrime[i]&&i*i<=N){
                count++;
            }
        }
        return count;
    }
}
