class Solution {
    public void pattern3(int n) {
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern3(n);
    }
}
