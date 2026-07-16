class Solution {
    public void pattern2(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern2(n);
    }
}
