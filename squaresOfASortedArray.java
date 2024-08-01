class Solution {
    public static void main(String a[]) {
        var num = new int[]{-4,-1,0,3,10};
        int[] result = new int[num.length];

        for( int i = 0; i < num.length; i++){
            num[i] = num[i] * num[i];
        }

        int head = 0;
        int tail = num.length - 1;

        for (int position = num.length - 1; position >= 0; position--){
            if (num[head] >num[tail]){
                result[position] = num[head];
                head++;
            } else {
                result[position] = num[tail];
                tail--;
            }
        }
        System.out.println(result);
    }
}