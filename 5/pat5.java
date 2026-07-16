class Solution {
    public void pattern5(int n) { 
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern5(n);
    }
}
