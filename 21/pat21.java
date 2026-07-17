class Solution {
    public void pattern21(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j< n; j++){
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                } else {
		            System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern21(n);
    }
}
