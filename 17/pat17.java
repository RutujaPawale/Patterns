class Solution {
    public void pattern17(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }
            char alpha = 'A';
            int breakpoint = (2*i + 1)/2;
            for (int j = 1; j <= 2*i + 1; j++){
                System.out.print(alpha);
                if (j <= breakpoint){
                    alpha++;
                } else{
                    alpha--;
                }
                
            }
            for (int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }
	    System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern17(n);
    }
}
